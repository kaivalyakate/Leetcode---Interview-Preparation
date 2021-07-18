import java.util.*;

public class DisappNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int i = 1, index = 0;
        while(i<=nums.length & index<nums.length){
            if(i!=nums[index]){
                ans.add(i);
            } 
            index++;
            if(index+1<nums.length & nums[index+1]!=nums[index]){
                i++;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{1, 2, 3, 4, 3, 4, 7, 8});        
    }
}
