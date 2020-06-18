package DVDLibraryServiceLayer;

import dao.DVDLibraryPersistenceException;
import dto.DVD;

import java.util.List;

public interface DVDLibraryServiceLayer {

    void createDVD(DVD dvd) throws
            DVDLibraryDuplicateIdException,
            DVDLibraryDataValidationException,
            DVDLibraryPersistenceException;

    List<DVD> getAllDVDs() throws
            DVDLibraryPersistenceException;

    DVD getDVD(String releaseDate) throws
            DVDLibraryPersistenceException;

    DVD removeDVD(String releaseDate) throws
            DVDLibraryPersistenceException;


}
