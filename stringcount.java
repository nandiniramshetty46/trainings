import java.util.Arrays;
import java.util.List;

public class stringcount {
    public static void stringct() {
        List<String> fruits = Arrays.asList("apple", "banana", "mango", "berry", "muskmelon");
        char specificLetter = 'b';
        Long count = fruits.stream().filter(word -> word.toLowerCase().startsWith(String.valueOf(specificLetter).toLowerCase())).count();
        System.out.println(count);
    }
}