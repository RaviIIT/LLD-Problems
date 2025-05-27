package ATM_Design;

public class ReadyState implements State {
    ATM atm;

    ReadyState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int startTransaction() {
        // some DB calls internally to generate new transactionId and add it to DB
        this.atm.setState(new CardReadingState(this.atm));
        return 1;
    }

    @Override
    public void readCardDetails(int cardNumber, int transId) {
        throw new UnsupportedOperationException("Can't perform method readCardDetails");
    }

    @Override
    public void readWithdrawDetails(int cardNumber, int transId, float amount) {
        throw new UnsupportedOperationException("Can't perform method readWithdrawDetails");
    }

    @Override
    public void dispenseCash(int transId) {
        throw new UnsupportedOperationException("Can't perform method dispenseCash");
    }

    @Override
    public void cancelTransaction(int transId) {
        throw new UnsupportedOperationException("Can't perform method readCardDetails");
    }
    
}
