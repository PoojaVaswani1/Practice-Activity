import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountStream {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("qj","abs","abc","abc","xyz","xyz");
        Map<String,Long> namesCount = list
                                .stream()
                                .collect(
                                 Collectors.groupingBy(
                                  Function.identity()
                                 , Collectors.counting()
                                 ));
        System.out.println(namesCount);
    }
}
