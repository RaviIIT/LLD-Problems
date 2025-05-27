package VendingMachine;

public class ReadyState implements State{
    VendingMachine vendingMachine;

    ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public int startTransaction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startTransaction'");
    }

    @Override
    public void selectItem(int itemId, int transId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectItem'");
    }

    @Override
    public void makePayment(int transId, float amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePayment'");
    }

    @Override
    public void dispenseItem(int transId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseItem'");
    }

    @Override
    public void cancelTransaction(int transId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelTransaction'");
    }

    @Override
    public void setState(State state) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setState'");
    }
    
    
}
