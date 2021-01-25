import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowSum {

    public static List<Integer> howSum(int targetSum, List<Integer> numbers) {
        if (targetSum == 0) {
            return new ArrayList<>();
        } else if (targetSum < 0) {
            return null;
        }

        for (Integer x : numbers) {
            int remainder = targetSum - x;
            List<Integer> remainderResult = howSum(remainder, numbers);
            if (remainderResult != null) {
                List<Integer> concat1 = new ArrayList<>();
                concat1.addAll(0, remainderResult);
                concat1.add(x);
                return concat1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[] { 2, 3 });
        System.out.println(howSum(7, numbers));
    }
}
