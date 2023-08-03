interface Addition{
 public void add();
}
public class LambdaFunction {
    public static void main(String[] args) {
        Addition add1 = () ->{
            System.out.println("additon");
        };
        add1.add();
    }
    
}
