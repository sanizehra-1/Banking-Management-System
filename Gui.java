/**
 * Abstract base class representing a generic bank account.
 * Implements core balance management and abstract transaction methods.
 */
public abstract class Gui {
    public double balance;

    public Gui(double initialBalance) {
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public double transferTo(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid transfer amount or insufficient funds.");
        }
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}