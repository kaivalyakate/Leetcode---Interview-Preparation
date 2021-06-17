import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegmentTreeImplementation {

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(new Integer[] { 1, 5, 2, 4, 3 });
        STree segmentTreeImpl = new STree();
        segmentTreeImpl.setElements(elements);
        segmentTreeImpl.setSegmentTree(2 * elements.size() - 1);
        segmentTreeImpl.build(0, 0, elements.size() - 1);
        System.out.println(segmentTreeImpl.toString());
        System.out.println(segmentTreeImpl.query(0, 0, elements.size() - 1, 1, 6));
        segmentTreeImpl.update(0, 0, elements.size()-1, 2, 6);
        System.out.println(segmentTreeImpl.toString());
        System.out.println(segmentTreeImpl.query(0, 0, elements.size() - 1, 1, 3));
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
