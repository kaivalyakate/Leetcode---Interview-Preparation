import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * LengthAndSum
 */
public class LengthAndSum {

    public static Boolean can(int m, int s) {
        return (s >= 0 && s <= 9 * m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int sum = s;
        String ans = "";
        for (int i = 0; i < m; i++) {
            for (int d = 0; d < 10; d++) {
                if ((i > 0 || d > 0 || (m == 1 && d == 0)) && can(m - i - 1, sum - d)) {
                    ans += "" + d;
                    sum -= d;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}