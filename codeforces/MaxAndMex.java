import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MaxAndMex {

    public static int FindMex(List<Integer> multiSet){
        int x = 0;
        for(int i: multiSet){
            if(i==x){
                x+=1;
            } else {
                return x;
            }
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        while(t!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> multiSet = new ArrayList<>();
            for(int i=0;i<n;i++){
                multiSet.add(sc.nextInt());
            }
            for(int i=0;i<k;i++){
                Collections.sort(multiSet);
                int mex = FindMex(multiSet);
                int max = multiSet.get(multiSet.size()-1);
                int newElement = (int) Math.ceil((double)(mex+max)/2);
                multiSet.add(newElement);
            }
            HashMap<Integer, Integer> arrayMapping = new HashMap<>();
            for(int x: multiSet){
                if(arrayMapping.get(x)==null){
                    arrayMapping.put(x, 1);
                } else {
                    arrayMapping.put(x, arrayMapping.get(x)+1);
                }
            }
            ans.add(arrayMapping.size());
            t--;
        }
        for(int x: ans){
            System.out.println(x);
        }
        sc.close();
    }
}
