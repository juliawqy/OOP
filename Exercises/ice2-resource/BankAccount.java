
// This class is for Q9
public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 500;
    }

    public BankAccount(float newBal) {
        this.balance = newBal;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {

        if (this.balance < amount) {
            return false;
        }

        this.balance -= amount;
        return true;

    }

    public boolean transfer(double amount, BankAccount otherAccount) {

        if (this.withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        }

        return false;

    }

}