import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NearlySorted {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        while(t!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> array = new ArrayList<>();
            for(int i=0;i<n;i++){
                array.add(sc.nextInt());
            }
            Collections.sort(array);
            ans.add(array);
            t--;
        }
        for(List<Integer> x: ans){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
