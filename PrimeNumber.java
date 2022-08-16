import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        int n,count = 0,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a Prime Number.");
        }
        else{
            System.out.println(n+" is not a Prime Number.");
        }
    }
}
