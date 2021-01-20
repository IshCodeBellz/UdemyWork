package Dao;

public interface VendingMachineDao {

    List<Item> getAllItems()
            throws VendingMachinePersistenceException;

    Item getItem(String itemNumber)
            throws VendingMachinePersistenceException;

    void purchaseItem(String itemNumber)
            throws VendingMachinePersistenceException;

}
