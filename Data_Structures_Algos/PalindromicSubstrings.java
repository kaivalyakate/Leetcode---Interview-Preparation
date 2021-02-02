import java.util.HashMap;

public class PalindromicSubstrings {

    public static HashMap<String, Boolean> palindromeMap = new HashMap<>();

    public static boolean PalindromeString(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        palindromeMap.put(str, true);
        return true;
    }

    public static int countSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subString = str.substring(i, j);
                if (subString.length() == 1) {
                    count += 1;
                } else if (PalindromeString(str.substring(i, j))) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "a";
        System.out.println(countSubstrings(A));
    }
}
