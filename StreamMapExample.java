public class StreamMapExample {
    public static void main(String[] args) {
    List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "mango");
    
    // Convert all fruits to uppercase
    List<String> uppercaseFruits = fruits.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
    
    System.out.println("Uppercase fruits: " + uppercaseFruits); // Output: [APPLE, BANANA, ORANGE, GRAPE, MANGO]
    }
    }