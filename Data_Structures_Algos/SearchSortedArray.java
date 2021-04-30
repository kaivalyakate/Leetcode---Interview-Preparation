import java.util.HashMap;

public class SearchSortedArray {
    
    public static int search(int[] nums, int target) {
        HashMap<Integer, Integer> ansMap = new HashMap<>();
        int i = 0;
        for(int x: nums){
            ansMap.put(x, i);
            i++;
        }
        if(ansMap.get(target)!=null){
            return ansMap.get(target);
        }
        return -1;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> ansMap = new HashMap<>();
        ansMap.put(1, 0);
        System.out.println(ansMap.get(0));
    }
}
