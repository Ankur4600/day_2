package day_2;
import java.util.Scanner;

public class array_name {
    //taking name from user and storin in array
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of name to be enter :");
        int size=s.nextInt();
        //Comparing size the array with 0
        if(size==0){
            System.out.println("Invalid size!!!");
            return;
        }
        String []arr = new String [size];
        System.out.print("Enter the names (UPPER CASE ONLY):");
        for(int i=0; i<size; i++){
            arr[i]= s.next();
        }
        //printing the names
        int a=1;
        System.out.println("Given Names are as follow :");
        for(int i=0;i<arr.length;i++){
            System.out.println(a+"->"+arr[i]);
            a++;
        }
    }
 }