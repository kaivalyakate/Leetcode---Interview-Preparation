import java.util.*;
import java.lang.Math;

class HeapSort {

    public static void main(String[] args) {
        Heap heapList = new Heap();
        Integer[] A = new Integer[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        heapList.setHeapList(Arrays.asList(A));
        heapList.BuildMaxHeap();
        System.out.println(heapList.getHeapList());   
    }
}

class Heap {

    private List<Integer> heapList;
    private List<Integer> sortedList = heapList;

    public int getLeftChild(int i) {
        return (2 * i) + 1;
    }

    public int getRightChild(int i) {
        return (2 * i) + 2;
    }

    public void MaxHeapify(int i) {
        int left = getLeftChild(i);
        int right = getRightChild(i);
        int largest;
        if (left < heapList.size() && (heapList.get(left) > heapList.get(i))) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < heapList.size() && (heapList.get(right) > heapList.get(largest))) {
            largest = right;
        }
        if (largest != i) {
            int temp = heapList.get(i);
            heapList.set(i, heapList.get(largest));
            heapList.set(largest, temp);
            MaxHeapify(largest);
        }
    }

    public int HeapExtractMax() {
        int temp = heapList.get(0);
        heapList.set(0, heapList.get(heapList.size() - 1));
        heapList.remove(0);
        MaxHeapify(0);
        return temp;
    }

    public void BuildMaxHeap() {
        for (int i = Math.floorDiv(heapList.size(), 2) - 1; i >= 0; i--) {
            MaxHeapify(i);
        }
    }

    public void setHeapList(List<Integer> A) {
        this.heapList = A;
    }

    public List<Integer> getHeapList() {
        return heapList;
    }
}