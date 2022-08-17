import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args){
        int n,i,fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
