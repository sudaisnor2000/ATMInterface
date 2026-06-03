import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    // Task 7
    public void showMenu() {

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    depositMoney();
                    break;

                case 2:
                    withdrawMoney();
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }


    public void depositMoney() {

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
    }


    public void withdrawMoney() {

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        account.withdraw(amount);
    }


    public void checkBalance() {

        System.out.println("Current Balance: " +
                account.getBalance());
    }
}