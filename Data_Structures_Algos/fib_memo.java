import java.util.HashMap;

/**
 * fib_memo
 */
public class fib_memo {

    public static int fibonacci(int n, HashMap<Integer, Integer> memo) {
        if (memo.getOrDefault(n, -1) != -1) {
            return memo.get(n);
        }
        if (n <= 2) {
            return 1;
        }
        memo.put(n, fibonacci(n - 1, memo) + fibonacci(n - 2, memo));
        return memo.get(n);
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println(fibonacci(7, memo));
    }
}