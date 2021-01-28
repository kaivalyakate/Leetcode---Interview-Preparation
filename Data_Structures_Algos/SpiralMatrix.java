import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        int r1 = 0, r2 = r - 1, c1 = c - 1, c2 = 0;
        ArrayList<Integer> spiralMatrixTraversalList = new ArrayList<>();
        while (r1 < r2 || c2 < c1) {
            if (r1 < r && c1 > -1 && c2 < c && r2 > -1) {
                for (int j = c2; j < c1; j++) {
                    spiralMatrixTraversalList.add(matrix[r1][j]);
                }
                for (int j = r1; j < r2; j++) {
                    spiralMatrixTraversalList.add(matrix[j][c1]);
                }
                for (int j = c1; j > c2; j--) {
                    spiralMatrixTraversalList.add(matrix[r2][j]);
                }
                for (int j = r2; j > r1; j--) {
                    spiralMatrixTraversalList.add(matrix[j][c2]);
                }
                r1 += 1;
                r2 -= 1;
                c1 -= 1;
                c2 += 1;
            }
        }
        return spiralMatrixTraversalList;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(spirallyTraverse(matrix, 4, 4));
    }
}
