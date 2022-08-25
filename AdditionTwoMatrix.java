import java.util.Scanner;
public class AdditionTwoMatrix {
    public static void main(String[] args){
        int row,col,i,j;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of range");
//        range = sc.nextInt();
        System.out.println("Enter the number of rows");
        row = sc.nextInt();

        System.out.println("Enter the number columns");
        col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int c[][] = new int[row][col];

        System.out.println("Enter all the elements of first matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j] = sc.nextInt();
                System.out.println();
            }
            }
        System.out.println("Enter all the elements of Second matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrices:-");

        for ( i= 0 ; i < row ; i++ )
        {
            for ( j= 0 ; j < col ;j++ )
                System.out.print(c[i][j]+"\t");

            System.out.println();
        }
    }
}
