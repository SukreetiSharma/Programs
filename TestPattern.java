public class TestPattern {
    public static void main(String[] args){
        int a[][] = {{2,3,2},{3,6,9},{2,6,4}};
        int b[][] = {{8,9,7},{5,6,4},{7,3,5}};
        int c[][] = new int[3][3];
        int i,j;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
