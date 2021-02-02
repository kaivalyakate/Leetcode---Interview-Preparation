import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Edible {

    static int edibleSlice(int r, int c, int start, int dir, int[][] matrix) {
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
        return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        int dir = sc.nextInt();

        int grid[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = edibleSlice(n, m, start, dir, grid);

        System.out.println(ans);
    }
}