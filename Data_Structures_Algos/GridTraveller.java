import java.util.HashMap;

public class GridTraveller {

    public static int gridTraveller(int m, int n, HashMap<String, Integer> memo) {
        if (m == 1 && n == 1) {
            return 1;
        } else if (m == 0 || n == 0) {
            return 0;
        }
        String key = m + "," + n;
        StringBuilder build = new StringBuilder();
        build.append(key);

        if (memo.getOrDefault(key, -1) != -1) {
            return memo.get(key);
        }

        memo.put(key, gridTraveller(m, n - 1, memo) + gridTraveller(m - 1, n, memo));
        return memo.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> memo = new HashMap<String, Integer>();
        System.out.println(gridTraveller(2, 3, memo));
        System.out.println(gridTraveller(3, 2, memo));
        System.out.println(gridTraveller(3, 3, memo));
        System.out.println(gridTraveller(18, 18, memo));
    }
}
