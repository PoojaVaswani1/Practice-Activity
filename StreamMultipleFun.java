import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMultipleFun {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,16,17,18,19,19,16); 
        //max in a list  
       int max = numbers.stream().max(Integer ::compare).get();
       System.out.println(max);
       //duplicate count ..
        List <String> list = Arrays.asList("abc","abc","xyv","xyz","xyv");
       Map<String,Long> duplicate = list.stream().filter(i -> Collections.frequency(list, i)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(duplicate);

       List <String> list1 = Arrays.asList("abcde","abc","1234xyv","567789xyz","1xyv");
       Map<Integer, Long> print = list1.stream().map(String::length).sorted().collect(Collectors.groupingBy(
        Strings
       , Function.identity()
       ));
       System.out.println(print);
     }
}