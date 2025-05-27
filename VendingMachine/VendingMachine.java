// General steps taken to solve a state machine problem:
// 1. Identify the functions that are required to be implemented. These functions will be implemented in the VendingMachine and state classes
// 2. Identify the states and their transitions with functions
// 3. subjectClass should have a state variable and a constructor to initialize the state and machineId. Initial state fetched from DB using machineId
// 4. state classes should have a reference to the VendingMachine class
// 5. Basic function (needed almost in all state design problems)=> 
//    startTransaction() -> returns transactionId
//    passing transactionId to all other functions


package VendingMachine;

public class VendingMachine {
    private State state;
    private final int machineId;
    
    VendingMachine(int machineId) {
        // this.state = getting states from DB for this machineId
        this.machineId = machineId;
    }

    public int startTransaction() {
        return 1;
    }
    
    public void selectItem(int itemId, int transId) {
        this.state.selectItem(itemId, transId);
    }

    public void makePayment(int transId, float amount) {
        this.state.makePayment(transId, amount);
    }

    public void dispenseItem(int transId) {
        this.state.dispenseItem(transId);
    }

    public void cancelTransaction(int transId) {
        this.state.cancelTransaction(transId);
    }

    public void setState(State state) {
        this.state = state;
    }

}
