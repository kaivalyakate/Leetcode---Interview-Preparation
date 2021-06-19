import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SegmentTreeImplementation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elements.add(sc.nextInt());
        }
        STree segmentTree = new STree();
        segmentTree.setElements(elements);
        segmentTree.setSegmentTree(segmentTree.getTreeSize(elements.size()));
        segmentTree.build(0, 0, elements.size() - 1);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<q;i++){
            String qType = sc.next();
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            if(qType.equals("q")){
                ans.add(segmentTree.query(0, 0, elements.size()-1, q1-1, q2-1));
            } else {
                segmentTree.update(0, 0, elements.size()-1, q1-1, q2);
            }
        }
        for(Integer i: ans){
            System.out.println(i);
        }

        sc.close();
    }
}

class STree {

    public List<Integer> segmentTree = new ArrayList<>();

    private List<Integer> elements;

    public void build(int node, int start, int end) {

        if (start == end) {
            segmentTree.set(node, elements.get(start));
        } else {
            int mid = (start + end) / 2;

            build(2 * node + 1, start, mid);
            build(2 * node + 2, mid + 1, end);

            segmentTree.set(node, Math.min(segmentTree.get(2 * node + 1), segmentTree.get(2 * node + 2)));
        }
    }

    public int query(int node, int start, int end, int left, int right) {

        if (right < start || left > end) {
            return Integer.MAX_VALUE;
        } else if (left <= start && end <= right) {
            return segmentTree.get(node);
        } else {
            int mid = (start + end) / 2;
            int p1 = query(2 * node + 1, start, mid, left, right);
            int p2 = query(2 * node + 2, mid + 1, end, left, right);
            return Math.min(p1, p2);
        }
    }

    public void update(int node, int start, int end, int index, int val){
        if(start==end){
            segmentTree.set(node, val);
            elements.set(index, val);
        } else {
            int mid = (start+end)/2;
            if(start<=index && index<=mid){
                update(2*node+1, start, mid, index, val);
            } else {
                update(2*node+2, mid+1, end, index, val);
            }
            segmentTree.set(node, Math.min(segmentTree.get(2*node+1), segmentTree.get(2*node+2)));
        }
    }

    public void setElements(List<Integer> elements) {
        this.elements = elements;
    }

    public void setSegmentTree(int length) {
        this.segmentTree = Arrays.asList(new Integer[length]);
    }

    @Override
    public String toString() {
        String out = "";
        for (Integer x : segmentTree) {
            out += x + " ";
        }
        return out;
    }

    public int getTreeSize(int n) {
        int x = (int) Math.ceil(Math.log(n) / Math.log(2));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        return max_size;
    }
}
