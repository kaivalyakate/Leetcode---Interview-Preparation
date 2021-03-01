public class MergeTwoSortedArrays {

    public static int[] insert(int[] nums1, int i, int x, int element) {
        while (x > i) {
            nums1[x] = nums1[x - 1];
            x -= 1;
        }
        nums1[i] = element;
        return nums1;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, x = m + 1;
        while (i < m || j < n) {
            if (nums1[i] >= nums2[j]) {
                nums1 = insert(nums1, i, x, nums2[j]);
                i += 2;
                j += 1;
                x += 1;
            } else if (nums1[i] < nums2[j]) {
                i += 1;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        System.out.println(merge(nums1, 3, nums2, nums2.length));
    }
}
