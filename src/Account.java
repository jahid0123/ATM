public class Account {

    private int accountPin;
    private int accountNumber;
    private double accountBalance;

    public Account(int accountPin, int accountNumber, double accountBalance) {
        this.accountPin = accountPin;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(int accountPin) {
        this.accountPin = accountPin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
