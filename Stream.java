import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 20 , 19, 30);
       numbers.stream()
       .map(s -> s + "")
        .filter(s -> s.startsWith("1"))
        .forEach(System.out::println);
        
       
    }
}
