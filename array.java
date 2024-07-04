package day_2;
import java.util.*;
public class array{
    //array using java
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int arr= sc.nextInt();
        //comparing size with 0
        if(arr==0){
            System.out.println("Invalid size!!!");
            return;
        }
        //creating array with variable 'marks' which store marks of a student
        int [] marks= new int[arr];
        System.out.println("entre marks of the students :");
        for(int i=0; i<arr; i++){
            marks[i]=sc.nextInt();
        }
        //printing the given marks of students
        System.out.println("Marks of the students are as follow");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }

   
}