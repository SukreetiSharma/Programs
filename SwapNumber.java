import java.util.*;
public class SwapNumber {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value for a : ");
        a = sc.nextInt();
        System.out.print("Enter any value for b : ");
        b = sc.nextInt();

        c=a;
        a=b;
        b=c;
        System.out.print("After Swapping a = "+a+" and b = "+b);

    }
}
