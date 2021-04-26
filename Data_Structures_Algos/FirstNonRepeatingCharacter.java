import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static int firstUniqChar(String s) {
        int ans = s.length();
        for (char c = 'a'; c <= 'z'; c++) {

            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                ans = Math.min(index, ans);
            }

        }
        return ans == s.length() ? -1 : ans;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}

