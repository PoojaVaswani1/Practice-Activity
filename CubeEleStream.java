import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CubeEleStream {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6);
          list.stream().map(i -> i*i*i).filter(i -> i<50).forEach(System.out::println);
    }
}
