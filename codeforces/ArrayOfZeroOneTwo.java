import java.util.Scanner;

public class ArrayOfZeroOneTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] question = sc.next().toLowerCase().toCharArray();
        String ans = "";

        for (char x : question) {
            if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u' && x!='y') {
                ans += "." + x;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
