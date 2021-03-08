import java.util.Scanner;

public class StonesOnTheTable {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] colors = sc.next().toCharArray();
        int ans = 0;
        for(int i=0;i<colors.length-1;i++){
            if(colors[i]==colors[i+1]){
                ans+=1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
