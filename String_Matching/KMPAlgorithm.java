import java.util.ArrayList;
import java.util.List;

public class KMPAlgorithm {

    public static List<Integer> FoundIndexPattern(String text, String pat) {
        int N = text.length();
        int M = pat.length();

        int[] lps = new int[M];
        lps = ComputerLPSArray(pat, M, lps);

        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < N) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == M) {
                ans.add(i - j);
                j = lps[j - 1];
            } else if (i < N && text.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return ans;
    }

    public static int[] ComputerLPSArray(String pat, int M, int[] lps) {

        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];

                } else if (len == 0) {
                    lps[i] = len;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        List<Integer> ans = FoundIndexPattern(text, pat);
        for (int x : ans) {
            System.out.println(x);
        }
    }
}
