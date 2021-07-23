import java.util.*;

public class PathInAMatrix {

    public static boolean findPath(int[][] matrix){
        Queue<List<Integer>> queue = new LinkedList<>();
        int row = 0, col = 0;
        int[][] visited = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    row = i;
                    col = j;
                }
            }
        }
        Integer[] info = new Integer[]{matrix[row][col], row, col};
        queue.add(Arrays.asList(info));
        while(!queue.isEmpty()){
            List<Integer> cell = queue.remove();
            row = cell.get(1);
            col = cell.get(2);
            if(cell.get(0)==2){
                return true;
            }
            if(visited[row][col]==1){
                continue;
            }
            if(row+1<matrix.length && matrix[row+1][col]!=0){
                queue.add(Arrays.asList(new Integer[]{matrix[row+1][col], row+1, col}));
            } 
            if(row-1>=0 && matrix[row-1][col]!=0){
                queue.add(Arrays.asList(new Integer[]{matrix[row-1][col], row-1, col}));
            }
            if(col+1<matrix[row].length && matrix[row][col+1]!=0){
                queue.add(Arrays.asList(new Integer[]{matrix[row][col+1], row, col+1}));
            }
            if(col-1>=0 && matrix[row][col-1]!=0){
                queue.add(Arrays.asList(new Integer[]{matrix[row][col-1], row, col-1}));
            }
            visited[row][col] = 1;
        }
        return false;
    }
    

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{ 0, 3, 2 }, 
        { 3, 3, 0 }, 
        { 1, 3, 0 }}; 

        System.out.println(findPath(matrix));
    }
}
