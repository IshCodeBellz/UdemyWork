package controller;

import dao.DVDLibraryDao;
import dao.DVDLibraryDaoException;
import dao.DVDLibraryDaoFileImpl;
import dto.DVD;
import ui.DVDLibraryView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import java.util.List;

public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryDao dao;
    private UserIO io = new UserIOConsoleImpl();



    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try{
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listDVDs();
                    break;
                case 2:
                    createDVD();
                    break;
                case 3:
                    viewDVD();
                    break;
                case 4:
                    removeDVD();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
        } catch (DVDLibraryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void createDVD() throws DVDLibraryDaoException {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getReleaseDate(), newDVD);
        view.displayCreateSuccessBanner();
    }
    private void listDVDs() throws DVDLibraryDaoException{
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }
    private void viewDVD() throws DVDLibraryDaoException{
        view.displayDisplayDVDBanner();
        String releaseDate = view.getReleaseDateChoice();
        DVD dvd = dao.getDVD(releaseDate);
        view.displayDVD(dvd);
    }

    private void removeDVD() throws DVDLibraryDaoException{
        view.displayRemoveDVDBanner();
        String releaseDate = view.getReleaseDateChoice();
        DVD removedStudent = dao.removeDVD(releaseDate);
        view.displayRemoveResult(removedStudent);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }


}
