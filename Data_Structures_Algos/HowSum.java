import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HowSum {

    public static List<Integer> howSum(int targetSum, List<Integer> numbers, HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        } else if (targetSum == 0) {
            return new ArrayList<>();
        } else if (targetSum < 0) {
            return null;
        }

        for (Integer x : numbers) {
            int remainder = targetSum - x;
            List<Integer> remainderResult = howSum(remainder, numbers, memo);
            if (remainderResult != null) {
                List<Integer> concat1 = new ArrayList<>();
                concat1.addAll(0, remainderResult);
                concat1.add(x);
                memo.put(targetSum, concat1);
                return memo.get(targetSum);
            }
        }

        memo.put(targetSum, null);
        return null;
    }

    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> numbers = Arrays.asList(new Integer[] { 7, 14 });
        System.out.println(howSum(300, numbers, memo));
    }
}
