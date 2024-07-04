package day_2;

import java.util.Scanner;

//method in java
public class methods {
    public static void main(String[] args) {
       
        int x=100;
        int y=200;
        int z=500;
       int a= add(x,y,z);//function calling
       System.out.println(a);
       add();//function calling
       multiply(x,y,z);//calling another function for multiplication
        
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
 //parameterise function
    static int add (int a,int b,int c){
       
        return a+b+c;
    }
 //function for multiply
    static float multiply(float a,float b,float c){
        return a*b*c;
    }

}
