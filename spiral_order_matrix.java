package day_2;

import java.util.*;

public class spiral_order_matrix {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows:  ");
        int row=s.nextInt();
        System.out.println("Enter the number of columns: ");
        int col =s.nextInt();
        int matrix[][] = new int [row][col];
        System.out.println("enter the element of matrix(from top to buttom and once row at a time)");
        for (int i=0; i<row; i++){
            System.out.println("enter row no."+(i+1));
            for(int j=0; j<col; j++){
                matrix[i][j]= s.nextInt();
            }
        }
        int r1=0;// starting row
        int r2=row-1;//ending row
        int c1=0;//starting column
        int c2=col-1;//ending column
        while( r1<=r2 && c1<=c2){
            //from left to right
            for(int i=c1; i<=c2;i++){
                System.out.print(matrix[r1][i]+" ");
            }
            r1++;
            //from right top to right buttom
            for(int i=r1; i<=r2; i++){
                System.out.print(matrix[i][c2]+" ");
            }
            c2--;
            //from right buttom to left buttom
            for(int i=c2; i>=c1;i--){
                System.out.print(matrix[r2][i]+"");
            }
            r2--;
            //from left buttom to left top
            for(int i=r2; i>=r1;i--){
                System.out.print(matrix[i][c1]+" ");
            }
            c1++;
        }
    }
}
