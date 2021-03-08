import java.util.Scanner;

/**
 * FootBall
 */
public class FootBall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String positions = sc.next();
        int i = 0;
        while (i < positions.length()) {
            int count = 0;
            if (positions.charAt(i) == '0') {
                while (i < positions.length() & positions.charAt(i) == '0') {
                    count += 1;
                    i++;
                    if (i >= positions.length()) {
                        break;
                    }
                }
                if (count >= 7) {
                    System.out.println("YES");
                    break;
                }
            } else if (positions.charAt(i) == '1') {
                while (i < positions.length() & positions.charAt(i) == '1') {
                    count += 1;
                    i++;
                    if(i>=positions.length()){
                        break;
                    }
                }
                if (count >= 7) {
                    System.out.println("YES");
                    break;
                }
            } else {
                i++;
            }
            if (i >= positions.length()) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}