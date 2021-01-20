package Service;

public class VendingMachineServiceLayer {

    List<Item> getAllItems() throws
            VendingMachinePersistenceException;

    Item getItem(String itemNumber) throws
            VendingMachinePersistenceException;

    String purchaseItem(String itemNumber, BigDecimal deposit) throws
            VendingMachinePersistenceException,
            InsufficientFundsException,
            NoItemInventoryException;



}
