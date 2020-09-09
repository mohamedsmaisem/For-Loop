import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double accountBalance = 100.0;
        System.out.println("Current money on account: " + accountBalance);
        while(accountBalance > 0) {
            System.out.println("Enter amount:");
            double amount = input.nextDouble();
            System.out.println("Enter 1 for deposit, 2 for withdrawal");
            int operation = input.nextInt();
            if(operation == 1) {
                accountBalance += amount;
                System.out.println("Current money on account: " + accountBalance);
            } else if(operation == 2) {
                accountBalance -= amount;
                System.out.println("Current money on account: " + accountBalance);
            } else {
                System.out.println("Invalid input, please try transaction again ...");
            }
        }
        System.out.println("Dear customer you have no money left, transaction stopped ...");
    }
}

