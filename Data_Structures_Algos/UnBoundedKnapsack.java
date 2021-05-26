import java.util.Arrays;

public class UnBoundedKnapsack {
    
    private static int unboundedKnapsack(int W, int n, int[] val, int[] wt) {

        // dp[i] is going to store maximum value
        // with knapsack capacity i.
        int dp[] = new int[W + 1];

        // Fill dp[] using above recursive formula
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j < n; j++) {
                if (wt[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]);
                    System.out.println(wt[i]);
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        System.out.println(unboundedKnapsack(
            5, 9, 
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{9, 4, 5, 6, 2, 7, 8, 6, 1}));
    }
}
