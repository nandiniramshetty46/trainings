import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxmin {
    public static void maxminvalues() {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> max = values.stream().max(Integer::compareTo);
        Optional<Integer> min = values.stream().min(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println("Maximum value is: " + max);
        } else {
            System.out.println("List is empty");
        }
        if (min.isPresent()) {
            System.out.println("Minimum value is: " + min);
        } else {
            System.out.println("List is empty");
        }
    }
}