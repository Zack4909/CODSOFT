import java.util.Scanner;
public class ATMinterface
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial balance");
        double initialBalance = scanner.nextDouble(); // Initial balance, you can change this
        //System.out.println("Enter Account number");
        String accountNumber = "76458990"; // Replace with the user's actual account number

        BankAccount userAccount = new BankAccount(accountNumber, initialBalance);
        ATMMachine atm = new ATMMachine(userAccount);

        while (true) {
            System.out.println("\nATM Options:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    double balance = atm.checkBalance();
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}