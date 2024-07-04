package day_2;

import java.util.Scanner;
//
public class transposeOf_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
       // int i,j;
        System.out.println("Enter the element of matrix: ");
        for (int i=0; i<row; i++){
            System.out.println("Enter row "+(i+1));
            for(int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //
        System.out.println("Transpose of the matrix is");
        for(int j=0;j<col; j++){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
