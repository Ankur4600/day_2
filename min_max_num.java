package day_2;

import java.util.Scanner;

public class min_max_num {
    //program to find minimum and maximum number in given array
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size= sc.nextInt();
        //comparing size with 0
        if(size==0){
            System.out.println("Invalid size!!!");
            return;
        }
        float[]arr= new float[size];
        System.out.println("enter the numbers: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextFloat();
        }
        //initially min and max value should be same(according to me)
        float min=arr[0];
        float max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //printing the min and max number
        System.out.println("Smallest number is: "+min);
        System.out.println("Largest number is:"+max);

    }
    
}