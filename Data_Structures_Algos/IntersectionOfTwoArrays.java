import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int length = nums1.length > nums2.length ? nums1.length : nums2.length;
        int []arr1 = nums1.length > nums2.length ? nums1 : nums2;
        int[] arr2 = nums1.length < nums2.length ? nums1 : nums2;
        boolean completed = false;
        for (int i = 0; i < length; i++) {
            if (arr1[i] == arr2[0]) {
                int j = 0;
                while (arr1[i] == arr2[j]) {
                    ans.add(arr2[j]);
                    j++;
                    i++;
                    if (i > arr1.length - 1 || j > arr2.length - 1) {
                        completed = true;
                        break;
                    }
                }
                if(completed){
                    return ans.stream().mapToInt(k -> k).toArray();
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 4, 9, 5 };
        int[] nums2 = new int[] { 9, 4, 9, 8, 4 };
        int[] ans = intersect(nums1, nums2);
        for (int x : ans) {
            System.out.println(x);
        }
    }
}
