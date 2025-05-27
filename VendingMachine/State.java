package VendingMachine;

public interface State {
    public int startTransaction();
    
    public void selectItem(int itemId, int transId);

    public void makePayment(int transId, float amount);

    public void dispenseItem(int transId);

    public void cancelTransaction(int transId);

    public void setState(State state);
}
