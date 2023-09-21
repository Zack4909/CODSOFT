import java.util.Scanner;

public class Start {
// ATM interface for ATM operations
interface ATM {
    void withdraw(double amount);
    void deposit(double amount);
    double checkBalance();
}

// BankAccount class to represent user bank accounts
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit failed. Invalid deposit amount.");
        }
    }
}

// ATMMachine class connecting to user BankAccount
class ATMMachine implements ATM {
    private BankAccount bankAccount;

    public ATMMachine(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void withdraw(double amount) {
        bankAccount.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    @Override
    public double checkBalance() {
        return bankAccount.getBalance();
    }
}



}