import java.util.HashMap;
import java.util.Scanner;

public class ATM extends Account {
    Scanner input = new Scanner(System.in);

    public ATM(int accountPin, int accountNumber, double accountBalance) {
        super(accountPin, accountNumber, accountBalance);
    }

    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() {
        //int x = 1;
        do{
            try{
                data.put(1001, 123);
                data.put(1002, 123);

                System.out.println("Welcome to ATM");
                System.out.print("Enter your account number: ");
                setAccountNumber(input.nextInt());
                System.out.println("Enter your PIN Number");
                setAccountPin(input.nextInt());

                int accNumber = getAccountNumber();
                int accPin = getAccountPin();
                if(data.containsKey(accNumber) && data.get(accNumber) == accPin){
                    getAccountType();
                }
                else{
                    System.out.println("\nWrong Account Number or PIN not correct\n\n");
                    getLogin();
                }
            }
            catch(Exception e){
                System.out.println("\nInvalid Account Number or PIN\n");
                getLogin();
            }


        }while(true);
    }

    public void getAccountType() {
        System.out.println("Select your account type: ");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        System.out.println("3. Exit");

        int selection = input.nextInt();

        switch (selection) {
            case 1 -> getChecking();
            case 2 -> getSaving();
            case 3 -> System.out.println("Thank you for using ATM, BYE");
            default -> {
                System.out.println("Invalid Choice");
                getAccountType();
            }

        }
    }

    public void getChecking() {
        System.out.println("Checking Account");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");

        int selection = input.nextInt();

        switch (selection) {
            case 1 -> {
                System.out.println("Checking Account Balance: "+getAccountBalance());
                getAccountType();
            }
            case 2 -> {
                getCheckingWithdrawInput();
                getAccountType();
            }
            case 3 -> {
                getCheckingDepositInput();
                getAccountType();
            }
            case 4 -> System.out.println("Thank you for using ATM, Bye");
            default -> {
                System.out.println("\nInvalid Choice\n");
                getChecking();
            }
        }
    }

    public void getSaving() {
        System.out.println("Saving Account");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Choice: ");

        int selection = input.nextInt();

        switch (selection) {
            case 1 -> {
                System.out.println("Saving Account Balance: "+ getAccountBalance() );
                getAccountType();
            }
            case 2 -> {
                getSavingWithdrawInput();
                getAccountType();
            }
            case 3 -> {
                getSavingDepositInput();
                getAccountType();
            }
            case 4 -> System.out.println("Thank you for using ATM, Bye\n");
            default -> {
                System.out.println("\nInvalid Choice\n");
                getChecking();
            }
        }
    }
}
