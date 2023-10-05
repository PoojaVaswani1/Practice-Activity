class InvalidAgeException  extends Exception  {
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}   

public class TestCustomException1  {
    public static void validate(int age) throws InvalidAgeException {
        if(age < 18){
        throw new InvalidAgeException("age not valid");

        }
        else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) {
        try{
        validate(13);
    } catch (InvalidAgeException ex)  
    {  
        System.out.println("Caught the exception");  

        // printing the message from InvalidAgeException object  
        System.out.println("Exception occured: " + ex);  
    }  

    System.out.println("rest of the code...");    
}  
}  
