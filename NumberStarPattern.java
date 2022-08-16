public class NumberStarPattern {
    public static void main(String[] args){
        int i,j,k;
        for(i=1;i<=3;i++){
            for(j=1;j<=3;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
                for(k=1;k>=1;k--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
