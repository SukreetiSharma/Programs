public class PascalTriangle {
    public static void main(String args[]){
        int i ,j,k;
        for(i=1;i<=5;i++){
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            int temp = 1;
            for(k=1;k<=i;k++){
                System.out.print(temp+" ");
                temp = temp*(i-k)/k;
            }
            System.out.println();
        }
    }
}
