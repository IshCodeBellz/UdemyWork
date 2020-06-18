package DVDLibraryServiceLayer;

import dto.DVD;

public class DVDLibraryDataValidationException extends Exception {

        public DVDLibraryDataValidationException(String message) {
            super(message);
        }

        public DVDLibraryDataValidationException(String message, Throwable cause) {
            super(message, cause);
        }

    private void validateDVDData(DVD dvd) throws
            DVDLibraryDataValidationException {

        if      (dvd.getTitle() == null
                || dvd.getTitle().trim().length() == 0
                || dvd.getDirectorsName() == null
                || dvd.getDirectorsName().trim().length() == 0
                || dvd.getMppaRating() == null
                || dvd.getMppaRating().trim().length() == 0
                || dvd.getStudio() == null
                || dvd.getStudio().trim().length() == 0
                || dvd.getUserRating() == null
                || dvd.getUserRating().trim().length() == 0);
        {

            throw new DVDLibraryDataValidationException(
                    "ERROR: All fields [First Name, Last Name, Cohort] are required.");
        }
    }

    }


