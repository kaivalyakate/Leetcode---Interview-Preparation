import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigDecimalSolution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        
        sc.close();
        for(int x=0;x<s.length-1;x++){
            int max = x;
            for(int y=x+1;y<s.length-2;y++){
                if (new BigDecimal(s[y]).compareTo(new BigDecimal(s[max])) > 0) {
                    max = y;
                }
            }
            String tmp = s[x];
            s[x] = s[max];
            s[max] = tmp;
        }
        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
