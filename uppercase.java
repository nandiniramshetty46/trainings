import java.util.Arrays;
import java.util.List;

public class uppercase {
    public static void uppercaseconversion() {
        List<String> characters = Arrays.asList("nandini", "india");
        characters.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}