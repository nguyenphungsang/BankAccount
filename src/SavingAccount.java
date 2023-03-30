public class SavingAccount extends BankAccount {
    // SavingAccount class that inherits BankAccount and has an additional attribute interestRate (real number), constructor, and interest calculation function (interest is calculated by balance interestRate/100).
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
}
