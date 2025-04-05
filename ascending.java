import java.util.Arrays;
import java.util.List;

public class ascending {
    public static void ascendingorder() {
        List<String> fruit = Arrays.asList("apple", "banana", "mango", "berry", "muskmelon");
        fruit.stream().sorted().forEach(System.out::println);
    }
}