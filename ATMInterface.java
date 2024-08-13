import java.util.Scanner;

public class ATMInterface {
    private static double balance = 1000.00; // Initial balance
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Welcome to the ATM Interface!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void depositMoney() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount successfully deposited.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount successfully withdrawn.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Please try a smaller amount.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}
