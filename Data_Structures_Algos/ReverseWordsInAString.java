import java.util.Arrays;

public class ReverseWordsInAString {

    public static String reverseString(String s) {
        char[] ans = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        return String.copyValueOf(ans);
    }

    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        for (int i = 0; i < ans.length; i++) {
            ans[i] = reverseString(ans[i]);
        }
        return String.join(" ", ans);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords("Abc def g'h"));
    }
}
