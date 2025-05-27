package ATM_Design;

public class CardReadingState implements State {
    ATM atm;

    CardReadingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int startTransaction() {
        throw new UnsupportedOperationException("Can't perform method startTransaction");
    }

    @Override
    public void readCardDetails(int cardNumber, int transId) {
        throw new UnsupportedOperationException("Can't perform method readCardDetails");
    }

    @Override
    public void readWithdrawDetails(int cardNumber, int transId, float amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readWithdrawDetails'");
    }

    @Override
    public void dispenseCash(int transId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseCash'");
    }

    @Override
    public void cancelTransaction(int transId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelTransaction'");
    }
}
