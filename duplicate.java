import java.util.Arrays;
import java.util.List;

public class duplicate {
    public static void removingduplicate() {
        List<Integer> distinctnumbers = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9);
        distinctnumbers.stream().mapToInt(Integer::intValue).distinct().forEach(System.out::println);
    }
}