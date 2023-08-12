// Functional interface without lambda function
interface Addition{
  public void add();  
}
public class FunctionalInterface{
public static void main(String[] args) {
  Addition add1 = new Addition() {
    public void add()
    {
      System.out.println("adding");
    }
  };
   add1.add(); 
  } 
}

