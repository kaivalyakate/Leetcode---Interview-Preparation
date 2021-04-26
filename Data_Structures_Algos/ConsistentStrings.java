import java.util.HashMap;
import java.util.Iterator;

public class ConsistentStrings {

    public static int GetConsistent(String allowed, String[] words) {
        boolean ar[] = new boolean[26];
        int al = allowed.length();

        for (int i = 0; i < al; i++) {
            ar[allowed.charAt(i) - 'a'] = true;
        }
        int count = 0;
        for (int j = 0; j < words.length; j++) {
            boolean flag = true;
            String s = words[j];
            int l = s.length();
            for (int k = 0; k < l; k++) {
                if (ar[s.charAt(k) - 'a'] != true) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[] { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(GetConsistent(allowed, words));
    }
}
