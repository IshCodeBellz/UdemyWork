package controller;


import DVDLibraryServiceLayer.DVDLibraryDataValidationException;
import DVDLibraryServiceLayer.DVDLibraryDuplicateIdException;
import DVDLibraryServiceLayer.DVDLibraryServiceLayer;
import dao.DVDLibraryDao;
import dao.DVDLibraryPersistenceException;
import dto.DVD;
import ui.DVDLibraryView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import java.util.List;

public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryServiceLayer service;
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
        } catch (DVDLibraryPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createDVD() throws DVDLibraryPersistenceException {
            view.displayCreateDVDBanner();
            boolean hasErrors = false;
            do {
                DVD currentDVD = view.getNewDVDInfo();
                try {
                    service.createDVD(currentDVD);
                    view.displayCreateSuccessBanner();
                    hasErrors = false;
                }
                catch (DVDLibraryDuplicateIdException | DVDLibraryDataValidationException e) {
                    hasErrors = true;
                    view.displayErrorMessage(e.getMessage());
                }
            } while (hasErrors);
    }

    private void listDVDs() throws DVDLibraryPersistenceException {
        List<DVD> dvdList = service.getAllDVDs();

        view.displayDVDList(dvdList);
    }
    private void viewDVD() throws DVDLibraryPersistenceException {
        String releaseDate = view.getReleaseDateChoice();
        DVD dvd = service.getDVD(releaseDate) ;
        view.displayDVD(dvd);
    }

    private void removeDVD() throws DVDLibraryPersistenceException {
            view.displayRemoveDVDBanner();
            String releaseDate = view.getReleaseDateChoice();
            service.removeDVD(releaseDate);
            view.displayRemoveSuccessBanner();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.service = service;
        this.view = view;
    }


}
