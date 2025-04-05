import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class secmaxmin {
    public static void secmaxminvalues() {

        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> sorted = digits.stream().distinct().sorted().collect(Collectors.toList());
        if (sorted.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Second Min: " + sorted.get(1));
            System.out.println("Second Max: " + sorted.get(sorted.size() - 2));

        }
    }
}