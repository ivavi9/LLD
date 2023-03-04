package facade;

public class BankingFacade {

    private InventoryManagement inventoryManagement;
    private InvoiceGenerator invoiceGenerator;
    private PaymentManager paymentManager;

    public BankingFacade(){
        inventoryManagement = new InventoryManagement();
        invoiceGenerator = new InvoiceGenerator();
        paymentManager = new PaymentManager();
    }

    public void createOrder(){
        invoiceGenerator.generateInvoice();
        paymentManager.managePayment();
        inventoryManagement.manageInventory();
    }

}
