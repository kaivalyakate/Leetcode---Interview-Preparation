import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BestSum {

    public static List<Integer> bestSum(int targetSum, List<Integer> numbers) {
        if (targetSum == 0) {
            return new ArrayList<>();
        } else if (targetSum < 0) {
            return null;
        }

        List<Integer> shortestCombination = null;

        for (Integer x : numbers) {
            int remainder = targetSum - x;
            List<Integer> remainderResult = bestSum(remainder, numbers);
            if (remainderResult != null) {
                List<Integer> concat1 = new ArrayList<>();
                concat1.addAll(0, remainderResult);
                concat1.add(x);
                if (shortestCombination == null || concat1.size() < shortestCombination.size()) {
                    shortestCombination = concat1;
                }
            }
        }

        return shortestCombination;
    }

    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> numbers = Arrays.asList(new Integer[] { 2, 3, 5 });
        System.out.println(bestSum(8, numbers));
    }
}
