import java.util.Scanner;

abstract class Bank {
    int pin;
    double account_Bal = 10000;
    abstract void Deposit();
    abstract void withdraw();
    abstract void Show_Balance();
}
class Service extends Bank {
    void Deposit() {
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
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

    void Show_Balance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pin: ");
        pin = sc.nextInt();
        if (pin == 000) {
            System.out.println("Your Balance is : " + account_Bal);
        } else {
            System.out.println("Invalid Pin!!");
        }
    }

}
public class Bank_Abstraction{
    public static void main(String args[]){
        System.out.println("Enter 1 for Deposit");
        System.out.println("Enter 2 for Withdraw");
        System.out.println("Enter 3 for Balance Show");
        int choice;
        Scanner sc1 = new Scanner(System.in);
        choice = sc1.nextInt();
        Bank b = new Service();

        switch(choice){
            case 1:
                b.Deposit();
                break;
            case 2:
                b.withdraw();
                break;
            case 3:
                b.Show_Balance();
                break;
            default:
                System.out.print("Wrong Input !!");
        }
    }
}
