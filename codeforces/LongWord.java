import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> answers = new ArrayList<>();
        while (n != 0) {
            String ans = sc.next();
            if (ans.length() > 10) {
                ans = ans.substring(0, 1) + ans.substring(1, ans.length() - 1).length()
                        + ans.substring(ans.length() - 1, ans.length());
            }
            answers.add(ans);
            n -= 1;
        }
        for (String ans : answers) {
            System.out.println(ans);
        }
    }
}
