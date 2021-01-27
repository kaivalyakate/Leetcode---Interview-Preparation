import java.math.BigInteger;

class Quicksort_max_array {

    public static void main(String[] args) {
        String[] A = { "54", "546", "548", "60" };
        QMaxSort qsort = new QMaxSort();
        qsort.setA(A);
        qsort.QuickSort(0, A.length - 1);
        System.out.println(qsort);
        // String a = "11000026531000023614";
        // String b = "1";
        // System.out.println(a.compareTo(b));
    }
}

class QMaxSort {

    private String[] A;

    public void QuickSort(int p, int r) {
        if (p < r) {
            int q = partition(p, r);
            QuickSort(p, q - 1);
            QuickSort(q + 1, r);
        }
    }

    public boolean CheckGreaterElement(String a, String b) {
        String a1 = a + b;
        String a2 = b + a;
        if (a1.compareTo(a2) > 0) {
            return true;
        }
        return false;
        // return Integer.parseInt(a + b) >= Integer.parseInt(b + a);
    }

    public int partition(int p, int r) {
        int i = p - 1;
        String x = A[r];
        for (int j = p; j < r; j++) {
            if (CheckGreaterElement(A[j], x)) {
                i += 1;
                String temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        String temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }

    public void setA(String[] A) {
        this.A = A;
    }

    public String[] getA() {
        return this.A;
    }

    @Override
    public String toString() {
        String ans = "";
        for (String x : A) {
            ans += x;
        }
        return ans;
    }
}