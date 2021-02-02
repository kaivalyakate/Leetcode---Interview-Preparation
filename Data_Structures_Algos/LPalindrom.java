import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LPalindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> ans = new ArrayList<>();
        while (t != 0) {
            HashMap<Character, Integer> count = new HashMap<>();
            String s = sc.next();
            int m = s.length() / 2;
            for (int i = 0; i < m; i++) {
                if (count.get(s.charAt(i)) == null) {
                    count.put(s.charAt(i), 1);
                } else {
                    count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
                }
            }
            if (s.length() % 2 == 0) {
                for (int i = m; i < s.length(); i++) {
                    if (count.get(s.charAt(i)) != null) {
                        count.put(s.charAt(i), count.get(s.charAt(i)) - 1);
                    }
                }
            } else {
                for (int i = m + 1; i < s.length(); i++) {
                    if (count.get(s.charAt(i)) != null) {
                        count.put(s.charAt(i), count.get(s.charAt(i)) - 1);
                    }
                }
            }
            Collection<Integer> cols = count.values();
            int k = 0;
            for (Integer i : cols) {
                if (i > 0) {
                    ans.add("NO");
                    break;
                }
                k += 1;
            }
            if (k == cols.size()) {
                ans.add("YES");
            }
            t -= 1;
        }
        for (String as : ans) {
            System.out.println(as);
        }
        sc.close();
    }
}
