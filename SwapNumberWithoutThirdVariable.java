import java.util.Scanner;
public class SwapNumberWithoutThirdVariable {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value for a : ");
        a = sc.nextInt();
        System.out.print("Enter any value for b : ");
        b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.print("After Swapping a = "+a+" and b = "+b);
    }
}
