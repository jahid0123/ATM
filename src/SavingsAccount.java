import java.util.Scanner;

public class SavingsAccount extends Account{

    private final String ACCOUNT_TYPE = "Savings";
    Scanner input = new Scanner(System.in);

    public SavingsAccount(int accountPin, int accountNumber, double accountBalance, AccountType type) {
        super(accountPin, accountNumber, accountBalance, type);
    }


    @Override
    public void withdrawAmount() throws InvalidAmountException {
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

    @Override
    public void depositAmount() throws InvalidAmountException {
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
