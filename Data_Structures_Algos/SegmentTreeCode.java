import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegmentTreeCode {

    static int getMid(int s, int e) {
        return s + (e - s) / 2;
    }

    static int constructSTUtil(int arr[], int ss, int se, int[] st, int si) {

        // If there is one element in array, store
        // it in current node of segment tree and return
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }

        // If there are more than one elements, then
        // recur for left and right subtrees and
        // store the max of values in this node
        int mid = getMid(ss, se);

        st[si] = Math.max(constructSTUtil(arr, ss, mid, st, si * 2 + 1),
                constructSTUtil(arr, mid + 1, se, st, si * 2 + 2));

        return st[si];
    }

    static int MaxUtil(int[] st, int ss, int se, int l, int r, int node) {

        // If segment of this node is completely
        // part of given range, then return
        // the max of segment
        if (l <= ss && r >= se)
            return st[node];

        // If segment of this node does not
        // belong to given range
        if (se < l || ss > r)
            return -1;

        // If segment of this node is partially
        // the part of given range
        int mid = getMid(ss, se);

        return Math.max(MaxUtil(st, ss, mid, l, r, 2 * node + 1), MaxUtil(st, mid + 1, se, l, r, 2 * node + 2));
    }

    static int getMax(int[] st, int n, int l, int r) {

        // Check for erroneous input values
        if (l < 0 || r > n - 1 || l > r) {
            return -1;
        }

        return MaxUtil(st, 0, n - 1, l, r, 0);
    }

    static int[] constructST(int arr[], int n) {

        int x = (int) Math.ceil(Math.log(n) / Math.log(2));

        int max_size = 2 * (int) Math.pow(2, x) - 1;

        int[] st = new int[max_size];

        constructSTUtil(arr, 0, n - 1, st, 0);
        return st;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> price = new ArrayList<>();
        int[] rating = new int[n];
        for(int i=0;i<n;i++){
            price.add(sc.nextInt());
            rating[i] = sc.nextInt();
        }
        int[] st = constructST(rating, n);
        System.out.println(getMax(st, n, price.indexOf(1000), price.indexOf(1300)));
    }
}
