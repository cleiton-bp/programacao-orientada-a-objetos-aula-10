import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private static int accountCounter = 1;

    // Method to create a new account
    public void addAccount(double initialBalance) {
        Account newAccount = new Account(accountCounter++, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created: " + newAccount);
    }

    // Method to remove an account
    public void removeAccount(int accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account removed: " + account);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to add balance to an account
    public boolean addBalance(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Balance added. New balance: " + account.getBalance());
            return true;
        } else {
            System.out.println("Account not found.");
            return false;
        }
    }

    // Method to find an account by its number
    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    // Method to list all accounts
    public void listAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}