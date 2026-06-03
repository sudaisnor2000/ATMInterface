public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    public double getBalance() {
        return balance;
    }
}