public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        bank.addAccount(1000.0);
        bank.addAccount(500.0);

        // List accounts
        bank.listAccounts();

        // Add balance
        bank.addBalance(1, 200.0);

        // Remove account
        bank.removeAccount(2);

        // List accounts again
        bank.listAccounts();
    }
}