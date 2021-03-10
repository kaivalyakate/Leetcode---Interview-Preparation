import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoRepeatedElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[] { 1, 2, 1, 3, 4, 3 };
        HashMap<Integer, Integer> mapping = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int x : array) {
            if (mapping.get(x) == null) {
                mapping.put(x, 1);
            } else {
                mapping.put(x, mapping.get(x) + 1);
                if (mapping.get(x) == 2) {
                    ans.add(x);
                }
            }
        }
        // Iterator hmIterator = mapping.entrySet().iterator();

        // List<Integer> ans = new ArrayList<>();
        // while(hmIterator.hasNext()){
        // Map.Entry pair = (Map.Entry) hmIterator.next();
        // if(pair.getValue().toString().equals("2")){
        // ans.add(Integer.parseInt(pair.getKey().toString()));
        // }
        // }
        System.out.println(ans);
    }
}
