import java.util.Arrays;
import java.util.List;

public class lowercase {
    public static void lowercaseconversion() {
        List<String> character = Arrays.asList("NANDINI","INDIA");
        character.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}
