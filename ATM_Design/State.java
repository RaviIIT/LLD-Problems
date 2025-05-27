package ATM_Design;

public interface State {
    public int startTransaction();

    public void readCardDetails(int cardNumber, int transId);
        
    public void readWithdrawDetails(int cardNumber, int transId, float amount);

    public void dispenseCash(int transId);

    public void cancelTransaction(int transId);
}
