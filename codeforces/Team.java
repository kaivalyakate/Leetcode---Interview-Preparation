import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int correct = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                String ans = sc.next();
                if (ans.equalsIgnoreCase("1")) {
                    sum += 1;
                }
            }
            if (sum >= 2) {
                correct += 1;
            }
        }
        System.out.println(correct);
        sc.close();
    }
}
