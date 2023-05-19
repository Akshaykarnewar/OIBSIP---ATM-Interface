public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transaction successful! Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Transaction successful! Your new balance is: " + balance);
    }

    public void transfer(int targetAccountNumber, int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transfer successful! Your new balance is: " + balance);
            System.out.println("The target account has been credited with " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}