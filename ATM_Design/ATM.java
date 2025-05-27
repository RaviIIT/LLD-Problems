package ATM_Design;

public class ATM {
    public String machineId;
    private State state;

    ATM(String machineId) {
        this.machineId = machineId;
    }

    public int startTransaction() { 
        return this.state.startTransaction();
    }

    public void readCardDetails(int cardNumber, int transId) {
        
    }

    public void readWithdrawDetails(int cardNumber, int transId, float amount) {

    }

    public void dispenseCash(int transId) {

    }

    public void cancelTransaction(int transId) {

    }

    public void setState(State state) {
        this.state = state;
    }


}
