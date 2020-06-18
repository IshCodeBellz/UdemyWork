package ui;

import dto.DVD;

import java.util.List;

public class DVDLibraryView {

    private UserIO io;


    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVD's");
        io.print("2. Create New DVD");
        io.print("3. View a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    public DVD getNewDVDInfo() {
        String releaseDate = io.readString("Please enter release date");
        String title = io.readString("Please enter Title");
        String directorsName = io.readString("Please enter Directors Name");
        String mppaRating = io.readString("Please enter MPPA Rating");
        String studio = io.readString("Please enter studio");
        String userRating = io.readString("Please enter User Rating");

        DVD currentDVD = new DVD(releaseDate);
        currentDVD.setTitle(title);
        currentDVD.setDirectorsName(directorsName);
        currentDVD.setMppaRating(mppaRating);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        return currentDVD;
    }
    public void displayCreateDVDBanner() {
        io.print("=== Create DVD ===");
    }
    public void displayCreateSuccessBanner() {
        io.readString(
                "DVD successfully created.  Please hit enter to continue");
    }
    public void displayDVDList(List<DVD> dvdList) {
        for (DVD currentDVD : dvdList) {
            String dvdInfo = String.format("#%s : %s %s %s %s %s",
                    currentDVD.getReleaseDate(),
                    currentDVD.getTitle(),
                    currentDVD.getDirectorsName(),
                    currentDVD.getMppaRating(),
                    currentDVD.getStudio(),
                    currentDVD.getUserRating());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All DVD  ===");
    }

    public void displayDisplayDVDBanner () {
        io.print("=== Display DVD ===");
    }

    public String getReleaseDateChoice() {
        return io.readString("Please enter the release date.");
    }

    public void displayDVD(DVD dvd) {
        if (dvd != null) {
            io.print(dvd.getReleaseDate());
            io.print(dvd.getTitle());
            io.print(dvd.getDirectorsName());
            io.print(dvd.getMppaRating());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            io.print("");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDVDBanner () {
        io.print("=== Remove DVD ===");
    }

    public void displayRemoveResult(DVD dvdRecord) {
        if(dvdRecord != null){
            io.print("DVD successfully removed.");
        }else{
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    public DVDLibraryView(UserIO io) {
        this.io = io;
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }


}
