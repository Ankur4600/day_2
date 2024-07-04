package day_2;
//creating call and calling in main method by creating their object
 class person{
    //commom feature
    int age=22;
    float weight= 63.5f;
    String name ="Ankur Shrivastav";
    //behaviour
    void fav_colour(){
        System.out.println("favourite colour is RED");
    }
    void faith(){
        System.out.println("devotee of SHREE RAM CHANDRA");
    }
}
public class class_object {
    public static void main(String[] args) {
        person p=new person();//object of person class
        System.out.println("My name is "+p.name);
        System.out.println("I am "+p.age+" year old");
        System.out.println("I am of "+p.weight+" kg");
        //calling function from another class
        p.faith();
        p.fav_colour();
        
    }
    
    
}
