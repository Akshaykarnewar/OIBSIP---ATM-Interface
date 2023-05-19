public class Transaction {
    private int amount;
    private String type;
    private String dateTime;

    public Transaction(int amount, String type, String dateTime) {
        this.amount = amount;
        this.type = type;
        this.dateTime = dateTime;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Transaction of " + amount + " on " + dateTime + " (" + type + ")";
    }
}