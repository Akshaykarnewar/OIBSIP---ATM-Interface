public class ATM {
    private int userId;
    private int pin;
    private Account account;
    private TransactionHistory transactionHistory;

    public ATM(int userId, int pin, Account account) {
        this.userId = userId;
        this.pin = pin;
        this.account = account;
        this.transactionHistory = new TransactionHistory();
    }

    public void start() {
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your user ID: ");
        int inputId = Integer.parseInt(System.console().readLine());

        System.out.print("Enter your PIN: ");
        int inputPin = Integer.parseInt(System.console().readLine());

        if (inputId == userId && inputPin == pin) {
            System.out.println("Authentication successful!");
            System.out.println("What would you like to do?");
            System.out.println("1. View transactions history");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Transfer money");
            System.out.println("5. Quit");

            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    this.transactionHistory.viewHistory();
                    break;
                case 2:
                    System.out.println("How much do you want to withdraw?");
                    int amount = Integer.parseInt(System.console().readLine());
                    this.account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("How much do you want to deposit?");
                    int depositAmount = Integer.parseInt(System.console().readLine());
                    this.account.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Enter the target account number:");
                    int targetAccountNumber = Integer.parseInt(System.console().readLine());
                    System.out.println("How much do you want to transfer?");
                    int transferAmount = Integer.parseInt(System.console().readLine());
                    this.account.transfer(targetAccountNumber, transferAmount);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } else {
            System.out.println("Authentication failed!");
            System.out.println("Goodbye!");
        }

    }
}