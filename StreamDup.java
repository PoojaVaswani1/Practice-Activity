import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.reflect.Array;

public class StreamDup {
    public static void main(String[] args) {
        List numbers =  Arrays.asList(11, 12 , 13, 14, 14, 13 ,18, 9);
        HashSet set = new HashSet<>();
        numbers.stream().filter(s -> !set.add(s))
        .forEach(System.out::println);
    }
}
