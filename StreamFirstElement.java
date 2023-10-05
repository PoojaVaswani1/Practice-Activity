import java.util.Arrays;
import java.util.List;

public class StreamFirstElement {
    public static void main(String[] args) {
        List numbers = Arrays.asList(11,12,13,1,4,14);
        numbers.stream().findFirst().ifPresent(System.out::println);
    }
}
