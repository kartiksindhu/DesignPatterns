package Behavioral.State.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();  // Output: Coin inserted.
        vendingMachine.pressButton(); // Output: Please select a product first.

        vendingMachine.insertCoin();  // Output: Coin already inserted.
        vendingMachine.pressButton(); // Output: Product dispensed.
    }
}
