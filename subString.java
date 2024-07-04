package day_2;
// to demonstrate the woring of substring
public class subString {
    public static void main(String[] args) {
        String name ="Ankur Srivastav";
        //Method 1
        System.out.println(name.substring(7));//it create new string from 7th index (space also count as string)
        //method 2
        System.out.println(name.substring(4,8));// create new string between 4th index and 8th index
    }
    
}
