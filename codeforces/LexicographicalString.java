import java.util.Scanner;

public class LexicographicalString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] qOne = sc.next().toLowerCase().toCharArray();
        char[] qTwo = sc.next().toLowerCase().toCharArray();

        int ans = 0;

        for (int i = 0; i < qOne.length; i++) {
            if (qOne[i] != qTwo[i]) {
                if (qOne[i] > qTwo[i]) {
                    ans = 1;
                    break;
                } else if (qOne[i] < qTwo[i]) {
                    ans = -1;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
