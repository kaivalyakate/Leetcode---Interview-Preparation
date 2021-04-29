import java.math.BigDecimal;

public class CoinChangeProblem {

    public static int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            minCoins[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    if(minCoins[i-coins[j]]!=-1){
                        int noCoins = minCoins[i - coins[j]] + 1;
                        if (noCoins < minCoins[i]) {
                            minCoins[i] = noCoins;
                        }
                    }
                }
            }
            if(minCoins[i]==Integer.MAX_VALUE){
                minCoins[i] = -1;
            }
        }
        return minCoins[amount];
    }

    public static void main(String[] args) {
        BigDecimal bigNumber = new BigDecimal("3.14");
        System.out.println(bigNumber.toString());
    }
}
