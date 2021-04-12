public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        int[] ans = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            } else if(numbers[i]+numbers[j]<target){
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println();
    }
}
