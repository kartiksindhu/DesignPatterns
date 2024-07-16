package Behavioral.State.VendingMachine.states;

public class HasSelectionState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Product dispensed.");
    }

    @Override
    public void dispense() {
        System.out.println("Press the button to dispense the product.");
    }
}
