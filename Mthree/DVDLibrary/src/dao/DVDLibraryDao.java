package dao;

import dto.DVD;

import java.util.List;

public interface DVDLibraryDao {

        /**
         * Adds the given Student to the roster and associates it with the given
         * student id. If there is already a student associated with the given
         * student id it will return that student object, otherwise it will
         * return null.
         *
         * @param releaseDate id with which student is to be associated
         * @param dvd student to be added to the roster
         * @return the Student object previously associated with the given
         * student id if it exists, null otherwise
         */
        DVD addDVD(String releaseDate, DVD dvd) throws DVDLibraryPersistenceException;

        /**
         * Returns a List of all students in the roster.
         *
         * @return List containing all students in the roster.
         */
        List<DVD> getAllDVDs()throws DVDLibraryPersistenceException;

        /**
         * Returns the student object associated with the given student id.
         * Returns null if no such student exists
         *
         * @param releaseDate ID of the student to retrieve
         * @return the Student object associated with the given student id,
         * null if no such student exists
         */
        DVD getDVD(String releaseDate)throws DVDLibraryPersistenceException;

        /**
         * Removes from the roster the student associated with the given id.
         * Returns the student object that is being removed or null if
         * there is no student associated with the given id
         *
         * @param releaseDate id of student to be removed
         * @return Student object that was removed or null if no student
         * was associated with the given student id
         */
        DVD removeDVD(String releaseDate)throws DVDLibraryPersistenceException;

}
