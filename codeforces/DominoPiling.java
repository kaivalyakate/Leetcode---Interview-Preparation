import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int k = sc.nextInt();
        int ans = ((j * k) - ((j * k) % 2)) / 2;
        System.out.println(ans);
        sc.close();
    }
}
