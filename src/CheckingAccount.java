public class CheckingAccount extends BankAccount {
    // Checking Account class that inherits BankAccount
    private static final double TRANSACTION_FEE = 2.0;
    private static final int FREE_TRANSACTIONS = 3;
    private int transactionCount;

    public CheckingAccount(double balance) {
        super(balance);
        transactionCount = 0;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }

    @Override
    public void transfer(double amount, BankAccount otherAccount) {
        super.transfer(amount, otherAccount);
        transactionCount++;
    }

    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            double fee = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            withdraw(fee);
        }
        transactionCount = 0;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        SavingAccount account2 = new SavingAccount(2000, 2.5);
        CheckingAccount account3 = new CheckingAccount(3000);

        account1.deposit(500);
        account2.deposit(1000);
        account3.deposit(1500);

        account1.withdraw(200);
        account2.withdraw(300);
        account3.withdraw(400);

        account1.transfer(300, account2);
        account2.transfer(500, account3);
        account3.transfer(200, account1);

        account3.deductFees();

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("Account 3 balance: " + account3.getBalance());
    }
}
