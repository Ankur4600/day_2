package day_2;
//ParseInt method of integer class
//it is used to convert string to integer
public class stringTo_int {
    public static void main(String[] args) {
     //if we store integer in String the to convert it into integer we use this method
        String str="1234";
        int num =Integer.parseInt(str);
        System.out.println(num);
    
     //ToString methodof string class
     //to find length of integer
     int num1=1234;
     String str1=Integer.toString(num1);
     System.out.println(str1.length());
    }
    
}
