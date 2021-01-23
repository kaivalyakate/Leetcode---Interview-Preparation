class Quicksort {

    public static void main(String[] args) {
        Integer[] A = { 5, 4, 3, 2, 1 };
        QSort qsort = new QSort();
        qsort.setA(A);
        qsort.QuickSort(0, A.length - 1);
        System.out.println(qsort);
    }
}

class QSort {

    private Integer[] A;

    public void QuickSort(int p, int r) {
        if (p < r) {
            int q = partition(p, r);
            QuickSort(p, q - 1);
            QuickSort(q + 1, r);
        }
    }

    public int partition(int p, int r) {
        int i = p - 1;
        int x = A[r];
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i += 1;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }

    public void setA(Integer[] A) {
        this.A = A;
    }

    public Integer[] getA() {
        return this.A;
    }

    @Override
    public String toString() {
        String ans = "";
        for (int x : A) {
            ans += x;
        }
        return ans;
    }
}