package DVDLibraryServiceLayer;

import dao.DVDLibraryDao;
import dao.DVDLibraryPersistenceException;
import dto.DVD;

import java.util.List;

public class DVDLibraryServiceLayerImpl implements DVDLibraryServiceLayer {


    @Override
    public void createDVD(DVD dvd) throws
            DVDLibraryDuplicateIdException,
            DVDLibraryDataValidationException,
            DVDLibraryPersistenceException {

        // First check to see if there is alreay a student
        // associated with the given student's id
        // If so, we're all done here -
        // throw a ClassRosterDuplicateIdException
        if (dao.getDVD(dvd.getReleaseDate()) != null) {
            throw new DVDLibraryDuplicateIdException(
                    "ERROR: Could not create student.  Student Id "
                            + dvd.getReleaseDate()
                            + " already exists");
        }

        // Now validate all the fields on the given Student object.
        // This method will throw an
        // exception if any of the validation rules are violated.
        validateDVDData(dvd);

        // We passed all our business rules checks so go ahead
        // and persist the Student object
        dao.addDVD(dvd.getReleaseDate(), dvd);

    }

    @Override
    public List<DVD> getAllDVDs() throws
            DVDLibraryPersistenceException {
        return dao.getAllDVDs();
    }

    @Override
    public DVD getDVD(String releaseDate) throws
            DVDLibraryPersistenceException {
        return dao.getDVD(releaseDate);
    }

    @Override
    public DVD removeDVD(String releaseDate) throws
            DVDLibraryPersistenceException {
        return dao.removeDVD(releaseDate);
    }

    DVDLibraryDao dao;

    public DVDLibraryServiceLayerImpl(DVDLibraryDao dao) {
        this.dao = dao;
    }
}
