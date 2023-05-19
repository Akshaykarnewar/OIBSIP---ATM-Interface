public class Main {
    public static void main(String[] args) {
        Account account = new Account(12345, 1000);
        ATM atm = new ATM(12345, 1234, account);
        atm.start();
    }
}