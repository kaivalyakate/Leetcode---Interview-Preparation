import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CanSum {

    public static boolean canSum(int n, List<Integer> numbers, HashMap<Integer, Integer> memo) {
        if (n == 0) {
            return true;
        } else if (n < 0) {
            return false;
        }
        for (Integer x : numbers) {
            int j = n - x;
            if (memo.getOrDefault(j, -1) == 1) {
                return true;
            } else {
                if (canSum(j, numbers, memo)) {
                    memo.put(j, 1);
                } else {
                    memo.put(j, 0);
                }
                if (memo.get(j) == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

        System.out.println(canSum(300, Arrays.asList(new Integer[] { 2, 3 }), memo));
    }
}
