//STATIC METHOD REFERENCING...
interface Sayable{  
    void say();  
}  // Can also use predefined functional interface... instead of making interface

public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  