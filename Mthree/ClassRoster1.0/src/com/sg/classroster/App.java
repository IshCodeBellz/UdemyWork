package com.sg.classroster;

import controller.ClassRosterController;
import dao.ClassRosterAuditDao;
import dao.ClassRosterAuditDaoFileImpl;
import dao.ClassRosterDao;
import dao.ClassRosterDaoFileImpl;
import service.ClassRosterServiceLayer;
import service.ClassRosterServiceLayerImpl;
import ui.ClassRosterView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        // Instantiate the UserIO implementation
        UserIO myIo = new UserIOConsoleImpl();
        // Instantiate the View and wire the UserIO implementation into it
        ClassRosterView myView = new ClassRosterView(myIo);
        // Instantiate the DAO
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // Instantiate the Audit DAO
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        // Instantiate the Service Layer and wire the DAO and Audit DAO into it
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        // Instantiate the Controller and wire the Service Layer into it
        ClassRosterController controller = new ClassRosterController(myService, myView);
        // Kick off the Controller
        controller.run();
    }
}
