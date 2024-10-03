public class Bank {

    public class BankAccount {

        private double balance;


        public BankAccount(){
            balance = 0;
        }

        BankAccount (double balance){
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }


        public void setBalance(double balance){
            this.balance = balance;
        }


        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
        }


        public void withdraw(double amount) {
            if (amount > 0) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
        }

        public void printBalance() {
            System.out.println("Current balance: " + balance);
        }

        public void transfer(BankAccount NewAccount, double amount) {
            if (amount > 0 && amount <= this.balance) {
                this.balance -= amount;  // Deduct from this account
                NewAccount.deposit(amount);  // Add to the target account
            } else {
                throw new IllegalArgumentException("Transfer amount is invalid or exceeds balance");
            }
        }

    }
}