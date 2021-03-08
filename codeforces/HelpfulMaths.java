import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] question = sc.next().toCharArray();
        List<Integer> sumNumbers = new ArrayList<>();
        for (char x : question) {
            if (x != '+') {
                sumNumbers.add(Integer.parseInt("" + x));
            }
        }
        Collections.sort(sumNumbers);
        String ans = "";
        for (int i = 0; i < sumNumbers.size(); i++) {
            if (i != sumNumbers.size() - 1) {
                ans += sumNumbers.get(i) + "+";
            } else {
                ans += sumNumbers.get(i);
            }
        }
        System.out.println(ans);
    }
}