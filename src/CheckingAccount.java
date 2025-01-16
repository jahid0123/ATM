import java.util.Scanner;

public class CheckingAccount extends Account {

    Scanner input = new Scanner(System.in);

    public CheckingAccount(int accountPin, int accountNumber, double accountBalance, AccountType type) {
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

    }
}
