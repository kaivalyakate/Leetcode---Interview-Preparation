public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i<j){
            if(nums[i]%2!=0 & nums[j]%2==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }  else if((nums[i]%2==0 & nums[j]%2==0) || (nums[i]%2!=0  & nums[j]%2==0)){
                i++;
            } else if((nums[i]%2!=0 & nums[j]%2!=0) || (nums[i]%2==0  & nums[j]%2!=0)){
                j--;
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
        System.out.println(sortArrayByParity(new int[]{6, 4, 5, 3, 9, 2}));
    }
}
