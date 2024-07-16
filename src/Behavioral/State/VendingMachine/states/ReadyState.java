package Behavioral.State.VendingMachine.states;

public class ReadyState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Please select a product first.");
    }

    @Override
    public void dispense() {
        System.out.println("Please select a product first.");
    }
}
