public class main {

    public static void main(String[] args) {

        // Create an instance of the outer class (Bank)
        Bank bank = new Bank();

        // Create two accounts using the outer class instance
        Bank.BankAccount account1 = bank.new BankAccount(500);
        Bank.BankAccount account2 = bank.new BankAccount(300);

        // Print initial balances
        System.out.println("Initial Balances:");
        account1.printBalance();
        account2.printBalance();


        System.out.println("Initial Balances:");

        account1.deposit(30.6);
        account1.printBalance();
        account2.withdraw(59.3);
        account2.printBalance();

        // Transfer 200 from account1 to account2
        account1.transfer(account2, 200);

        // Print balances after transfer
        System.out.println("\nBalances after Transfer:");
        account1.printBalance();
        account2.printBalance();
    }
}
