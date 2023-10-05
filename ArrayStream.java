import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStream {
    public static void main(String[] args) {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.sort(arr);
        // Sorted the Array using parallelSort()
         
        Arrays.stream(arr).forEach(System.out::println);
        /* Converted it into Stream and then
           printed using forEach */
    }
}
