package day_2;
// learing about comparing of two string
public class compareTwo_string {
    public static void main(String[] args) {
        String name ="Ankur";
        String name1="Ankur";
     //Using "String1.equals(String2)"
        System.out.println("method 1");
        if(name.equals(name1)){
            System.out.println("the are same");
        }
        else{
            System.out.println("the are different");
        }
     // using user defined function(use to compare two String object)
        System.out.println("method 2");
        if(name==name1){
            System.out.println("the are same");
        }
        else{
            System.out.println("the are  not same");
        }
     //using String1.compareTO(string2)
        System.out.println("method 3");
         System.out.println(name.compareTo(name1));/*it give "0"as both are equal ,if it gives "1"indicating str2 comes after str1
                                                   if it gives "-1" means str2 comes before str1 */

     // it will ignore case of string compare  
     System.out.println("method 4");                                         
        if(name.equalsIgnoreCase(name1)){
            System.out.println("the are same");
        }
        else {
            System.out.println("the are not same");
        }
    }
}
