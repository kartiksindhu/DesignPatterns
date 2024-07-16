package Behavioral.State.VendingMachine;


import Behavioral.State.VendingMachine.states.HasSelectionState;
import Behavioral.State.VendingMachine.states.ReadyState;
import Behavioral.State.VendingMachine.states.VendingMachineState;

public class VendingMachine {
    VendingMachineState vendingMachineState;

    public VendingMachine() {
        this.vendingMachineState = new ReadyState();
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void insertCoin() {
        vendingMachineState.insertCoin();
        if (vendingMachineState instanceof ReadyState) {
            setVendingMachineState(new HasSelectionState());
        }
    }

    public void pressButton() {
        vendingMachineState.pressButton();
        if (vendingMachineState instanceof HasSelectionState) {
            vendingMachineState.dispense();
            setVendingMachineState(new ReadyState());
        }
    }
}
