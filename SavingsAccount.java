/**
 * Represents a savings account that extends the base Gui class.
 * Manages specific account numbers, deposits, and withdrawals.
 */
public class SavingsAccount extends Gui {
    private int accountNumber;

    public SavingsAccount(double initialBalance, int accountNumber) {
        super(initialBalance);
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }
}