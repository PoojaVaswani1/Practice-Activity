// INSTANCE METHOD REFERNCE..
interface sayable{
    void say();
}

public class MethodRefernce2 {
    public void say(){
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
         // Referring non-static method using reference  
        MethodRefernce2 methodRefernce = new MethodRefernce2();
        Sayable sayable = methodRefernce::say;
        sayable.say();
         // Referring non-static method using anonymous object  
         Sayable sayable1 = new MethodRefernce2()::say;
         sayable1.say();
    }
    
}
