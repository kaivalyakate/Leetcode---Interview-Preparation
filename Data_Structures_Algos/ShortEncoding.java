import java.util.Arrays;

/**
 * ShortEncoding
 */
public class ShortEncoding {

    public static int minimumLengthEncoding(String[] words) {
        String encoding = "";
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
        for (String x : words) {
            if (encoding.indexOf(x) == -1) {
                encoding += x + "#";
            } else if (encoding.indexOf(x) != -1) {
                if (encoding.charAt(encoding.lastIndexOf(x) + x.length()) != '#') {
                    encoding += x + "#";
                }

            }
        }
        return encoding.length();
    }

    public static void main(String[] args) {
        String[] words = { "xyeippx", "x" };
        System.out.println(minimumLengthEncoding(words));
    }
}