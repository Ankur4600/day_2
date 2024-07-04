package day_2;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
     //declaration
        Scanner sc = new Scanner(System.in);
        String name ="Ankur";


     //taking input from user
        // System.out.println("Enter the full name");
        // String name1 =sc.next();



     //concatnation (Joining two string)
        String name2 ="Tinku";
        String name3 ="Shrivastav";
        String full_name=name2+" "+name3;
        System.out.println(full_name);



     //print length of string
        System.out.println(full_name.length());


     // accessing the characters of a string with (charAt(i))
        for(int i =0;i<=full_name.length();i++){
           System.out.println(full_name.charAt(i));
        }

        
        
    }
}
