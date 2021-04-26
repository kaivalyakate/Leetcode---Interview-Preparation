public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==nums2[0]){
                int j = 0;
                while(nums1[i]==nums2[j]){
                    ans[j] = nums2[j];
                    j++;
                    i++;
                    if(i>nums1.length-1 || j>nums2.length-1){
                        break;
                    }
                }
                if(ans.length==nums2.length){
                    return ans;
                }   
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] ans = intersect(nums1, nums2);
        for(int x: ans){
            System.out.println(x);
        } 
    }
}

