package dao;

import dto.DVD;

import java.io.*;
import java.util.*;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    private Map<String, DVD> dvds = new HashMap<>();
    public static final String ROSTER_FILE = "dvdlibrary.txt";
    public static final String DELIMITER = "::";


    @Override
    public DVD addDVD(String releaseDate, DVD dvd) throws DVDLibraryDaoException{
        loadRoster();
        DVD prevDVD = dvds.put(releaseDate, dvd);
        writeRoster();
        return prevDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryDaoException{
        loadRoster();
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String releaseDate) throws DVDLibraryDaoException{
        loadRoster();
        return dvds.get(releaseDate);
    }

    @Override
    public DVD removeDVD(String releaseDate) throws DVDLibraryDaoException{
        loadRoster();
        DVD removedDVD = dvds.remove(releaseDate);
        writeRoster();
        return removedDVD;
    }

    private DVD unmarshallDVD(String dvdAsText){
        // studentAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // 1234::Ada::Lovelace::Java-September1842
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in studentTokens.
        // Which should look like this:
        // ______________________________________
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        // Given the pattern above, the student Id is in index 0 of the array.
        String releaseDate = dvdTokens[0];

        // Which we can then use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        DVD dvdFromFile = new DVD(releaseDate);

        // However, there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters.

        // Index 1 - FirstName
        dvdFromFile.setTitle(dvdTokens[1]);

        // Index 2 - LastName
        dvdFromFile.setDirectorsName(dvdTokens[2]);

        // Index 3 - Cohort
        dvdFromFile.setMppaRating(dvdTokens[3]);

        dvdFromFile.setStudio(dvdTokens[4]);

        dvdFromFile.setUserRating(dvdTokens[5]);

        // We have now created a student! Return it!
        return dvdFromFile;
    }
    private void loadRoster() throws DVDLibraryDaoException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException(
                    "-_- Could not load roster data into memory.", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;
        // currentStudent holds the most recent student unmarshalled
        DVD currentDVD;
        // Go through ROSTER_FILE line by line, decoding each line into a
        // Student object by calling the unmarshallStudent method.
        // Process while we have more lines in the file
        while (scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // unmarshall the line into a Student
            currentDVD = unmarshallDVD(currentLine);

            // We are going to use the student id as the map key for our student object.
            // Put currentStudent into the map using student id as the key
            dvds.put(currentDVD.getReleaseDate(), currentDVD);
        }
        // close scanner
        scanner.close();
    }
    private String marshallDVD(DVD aDVD){
        // We need to turn a DVD object into a line of text for our file.
        // For example, we need an in memory object to end up like this:
        // 4321::Charles::Babbage::Java-September1842

        // It's not a complicated process. Just get out each property,
        // and concatenate with our DELIMITER as a kind of spacer.

        // Start with the student id, since that's supposed to be first.
        String dvdAsText = aDVD.getReleaseDate() + DELIMITER;

        // add the rest of the properties in the correct order:

        // FirstName
        dvdAsText += aDVD.getTitle() + DELIMITER;

        // LastName
        dvdAsText += aDVD.getDirectorsName() + DELIMITER;

        // Cohort - don't forget to skip the DELIMITER here.
        dvdAsText += aDVD.getMppaRating() + DELIMITER;

        dvdAsText += aDVD.getStudio() + DELIMITER;

        dvdAsText += aDVD.getUserRating();

        // We have now turned a student to text! Return it!
        return dvdAsText;
    }
    /**
     * Writes all students in the roster out to a ROSTER_FILE.  See loadRoster
     * for file format.
     *
     * @throws DVDLibraryDaoException if an error occurs writing to the file
     */
    private void writeRoster() throws DVDLibraryDaoException {
        // NOTE FOR APPRENTICES: We are not handling the IOException - but
        // we are translating it to an application specific exception and
        // then simple throwing it (i.e. 'reporting' it) to the code that
        // called us.  It is the responsibility of the calling code to
        // handle any errors that occur.
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new DVDLibraryDaoException(
                    "Could not save student data.", e);
        }

        // Write out the Student objects to the roster file.
        // NOTE TO THE APPRENTICES: We could just grab the student map,
        // get the Collection of Students and iterate over them but we've
        // already created a method that gets a List of Students so
        // we'll reuse it.
        String dvdAsText;
        List<DVD> dvdList = new ArrayList(dvds.values());
        for (DVD currentDVD : dvdList) {
            // turn a DVD into a String
            dvdAsText = marshallDVD(currentDVD);
            // write the DVD object to the file
            out.println(dvdAsText);
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }
}
