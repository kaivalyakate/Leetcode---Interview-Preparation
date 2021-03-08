import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> ranks = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            ranks.add(sc.nextInt());
        }
        int j = ranks.get(k-1);
        for(Integer i: ranks){
            if(i>=j & i>0){
                sum+=1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
