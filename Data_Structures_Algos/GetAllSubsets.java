import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetAllSubsets {

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))> 0){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> ans = subsets(new int[]{1, 2, 3});
        for(List<Integer> x: ans){
            System.out.println(x.toString());
        }
    }
}

