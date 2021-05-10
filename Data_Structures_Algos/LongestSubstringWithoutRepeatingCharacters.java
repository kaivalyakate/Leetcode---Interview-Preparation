import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        Map<String, Integer> wordMap = new LinkedHashMap<>();
        if (s.length() >= 2) {
            while (j < s.length()) {
                if (!wordMap.containsKey(s.charAt(j) + "")) {
                    wordMap.put(s.charAt(j) + "", j);
                } else {
                    i = Math.max(wordMap.get(s.charAt(j) + "") + 1, i);
                    wordMap.put(s.charAt(j) + "", j);
                }
                if ((j - i + 1) > ans) {
                    ans = j - i + 1;
                }
                j++;
            }
        } else {
            return s.length();
        }
        return ans;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabba");
    }
}
