package Controller;

import Service.VendingMachineServiceLayer;

public class VendingMachineController {

    VendingMachineView view;
    VendingMachineServiceLayer service;

    //private UserIO io = new UserIOConsoleImpl();

    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineView view) {
        this.view = view;
        this.service = service;
    }

    public void run() {

        boolean keepGoing = true;
        int menuSelection = 0;

        try {
            listItems();

            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        purchaseItem();
                        break;
                    case 2:
                        viewItem();
                        break;
                    case 3:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (VendingMachinePersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void listItems()
            throws VendingMachinePersistenceException {
        view.displayDisplayAllBanner();
        List<Item> itemList = service.getAllItems();
        view.displayItemList(itemList);
    }

    private void viewItem()
            throws VendingMachinePersistenceException {
        view.displayItemBanner();
        String itemNumber = view.getItemNumberChoice();
        Item item = service.getItem(itemNumber);
        view.displayItem(item);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private void purchaseItem()
            throws VendingMachinePersistenceException {

        BigDecimal deposit = requestDeposit();

        boolean hasErrors = false;
        do {
            String itemNumber = view.getItemNumberChoice();
            try {
                String purchasedItem = service.purchaseItem(itemNumber, deposit);
                view.displayChange(purchasedItem);
                view.displayThankYouPurchase();
                hasErrors = false;
            } catch (InsufficientFundsException | NoItemInventoryException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
        // code not complete

    }

    private BigDecimal requestDeposit() {
        BigDecimal deposit = view.displayRequestDeposit();
        view.displayDepositSuccessful();
        return deposit;
    }



}