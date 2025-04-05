import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class average {
    public static void avg() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average();
        if (average.isPresent()) {
            System.out.println("Average is " + average.getAsDouble());
        } else {
            System.out.println("List is empty");
        }
    }
}