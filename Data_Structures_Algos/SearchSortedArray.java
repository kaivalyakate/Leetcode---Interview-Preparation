public class SearchSortedArray {
    
    public static int search(int[] nums, int target) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = i;
            }
        }
        int i = 0, j = 0;
        if(target>=nums[0] && target<=nums[max]){
            i = 0;
            j = max+1;
        } else if(max+1<nums.length && target>=nums[max+1] && target<=nums[nums.length-1]){
            i = max+1;
            j = nums.length;
        } else {
            return -1;
        }
        while(i<j){
            if(nums[i]==target){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,9,10,2,3}, 6));
    }
}
