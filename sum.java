import java.util.Arrays;
import java.util.List;

public class sum {
    public static void sumofnum() {
        List<Integer> sumofnumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = sumofnumbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum is " + sum);
    }
}