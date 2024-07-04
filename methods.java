package day_2;

import java.util.Scanner;

//method in java
public class methods {
    public static void main(String[] args) {
        // add();
        int x=100;
        int y=200;
        int z=500;
       int a= add(x,y,z);
       System.out.println(a);
        
    }
    //function without passing any parameter
    static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number and second number and third number");
        int a= sc.nextInt();      
        int b= sc.nextInt();
        int c=a+b;
        System.out.println("the sum of the number is "+c);
    }
    static int add (int a,int b,int c){
       
        return a+b+c;
    }
}
