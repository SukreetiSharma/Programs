public class StarPattern3 {
    public static void main(String[] args) {
        int i, j;
        for(i=1;i<=5;i++){
            for(j=i;j<=5;j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 2 * i-2; j++) {
                System.out.print(" ");
            }
            for(j=i;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2;i<=5;i++){
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (j=2*i-2; j <2*5-2; j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
