public class pattern1 {
    public static void main(String [] args) {
        int i,j;
        for(i=0;i<=2;i++){
            System.out.println("*");
            for(j=0;j<=i;j++) {
                System.out.print(" ");
            }
        }
        for(i=0;i<2;i++){
            System.out.print("*");
        }
       // System.out.println();
        for(i=0;i<=3;i++){
            System.out.println("*");
            for(j=1;j>=i;j--) {
                System.out.print(" ");
            }
        }
    }
}
