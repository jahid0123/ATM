import java.util.Scanner;

public abstract class Account {

    private int accountPin;
    private int accountNumber;
    private double accountBalance;
    private AccountType type;
    Scanner input = new Scanner(System.in);


    public Account(int accountPin, int accountNumber, double accountBalance, AccountType type) {
        this.accountPin = accountPin;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.type = type;
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

    public void withdrawAmount() throws InvalidAmountException{
        System.out.print("Enter withdraw amount: ");
        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println("Invalid amount!");
        } else if (amount<=getAccountBalance()) {
            setAccountBalance(getAccountBalance() - amount);
        }else {
            throw new InvalidAmountException("Amount must be digit");
        }
    }

    public void depositAmount() throws InvalidAmountException{
        System.out.print("Enter deposit amount: ");
        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println("Invalid amount!");
        } else if (amount>0) {
            setAccountBalance(getAccountBalance() + amount);
        }else {
            throw new InvalidAmountException("Amount must be in digit");
        }
    }
}
