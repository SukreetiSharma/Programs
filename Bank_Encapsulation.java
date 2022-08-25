import java.util.Scanner;
class Services {
    Scanner sc = new Scanner(System.in);

    private double account_Bal = 10000;
    private int pin;

    void deposit() {
        System.out.println("Enter Pin: ");
        pin = sc.nextInt();
        if (pin == 000) {
            System.out.println("Deposit money Amount: ");
            double deposit_Money = sc.nextDouble();
            account_Bal = account_Bal + deposit_Money;
            System.out.println("Deposit money Amount: " + deposit_Money);
            System.out.println("Account Balance : " + account_Bal);
        } else {
            System.out.println("Invalid Pin!!");
        }
    }

    void withdraw() {
        System.out.println("Enter Pin: ");
        pin = sc.nextInt();
        if (pin == 000) {
            System.out.println("Withdraw money Amount: ");
            double withdraw_Money = sc.nextDouble();
            if (withdraw_Money < account_Bal) {
                account_Bal = account_Bal - withdraw_Money;
                System.out.println("WithDraw money Amount: " + withdraw_Money);
                System.out.println("Account Balance : " + account_Bal);
            } else {
                System.out.println("Not have enough money !!");
            }
        } else {
            System.out.println("Invalid Pin!!");
        }
    }

    void show_Balance() {
        System.out.println("Enter Pin: ");
        pin = sc.nextInt();
        if (pin == 000) {
            System.out.println("Your Balance is : " + account_Bal);
        } else {
            System.out.println("Invalid Pin!!");
        }
    }
}
public class Bank_Encapsulation {
    public static void main(String args[]) {
        System.out.println("Enter 1 for Deposit");
        System.out.println("Enter 2 for Withdraw");
        System.out.println("Enter 3 for Balance Show");
        int choice;
        Scanner sc1 = new Scanner(System.in);
        choice = sc1.nextInt();
        Services b = new Services();

        switch (choice) {
            case 1:
                b.deposit();
                break;
            case 2:
                b.withdraw();
                break;
            case 3:
                b.show_Balance();
                break;
            default:
                System.out.print("Wrong Input !!");
        }
    }
}

