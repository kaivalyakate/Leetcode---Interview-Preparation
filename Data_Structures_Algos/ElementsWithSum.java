import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementsWithSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arrayNum = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            arrayNum.add(i);
        }

        int i = 0;
        while (i < arrayNum.size()) {
            int j = 0;
            while (j < arrayNum.size()) {
                int sum = 0;
                if (sum == k) {

                }
            }
        }

        sc.close();
    }
}
