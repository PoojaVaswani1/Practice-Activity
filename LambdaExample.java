interface Calculator {
    int add(int a, int b);
    }
    
    public class LambdaExample {
    public static void main(String[] args) {
    Calculator addition = (a, b) -> a + b;
    int result = addition.add(5, 10);
    System.out.println("Result: " + result); // Output: Result: 15
    }
    }