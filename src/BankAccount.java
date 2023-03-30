public class BankAccount {
    // class BankAccount with a property balance (real number), constructor, getter, setter and three methods: deposit, withdraw, transfer.
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transfer(double amount, BankAccount otherAccount) {
        withdraw(amount);
        otherAccount.deposit(amount);
    }
}
