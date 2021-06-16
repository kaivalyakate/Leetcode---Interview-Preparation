import java.util.Arrays;
import java.util.Collections;

public class ZeroOneMatrix {
    
    public static int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = getNearestZero(mat, i, j, 0);
                }
            }
        }
        return new int[][]{};
    }

    public static int getNearestZero(int[][] mat, int i, int j, int count){
        if(i>=mat.length || j>=mat[i].length || i<0 || j<0){
            return 0;
        } 
        if(mat[i][j]==0){
            return count+1;
        } else {
            count += Collections.min(Arrays.asList(new Integer[]{
                getNearestZero(mat, i+1, j, count+1),
                getNearestZero(mat, i-1, j, count+1),
                getNearestZero(mat, i, j-1, count+1),
                getNearestZero(mat, i, j+1, count+1)}));
            return count;
        }
    }

    public static void main(String[] args) {
        int[][] qs = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        updateMatrix(qs);
    }
}
