import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class descending {
    public static void descendingorder() {
        List<String> strings = Arrays.asList("apple", "banana", "mango", "berry", "muskmelon");
        strings.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}