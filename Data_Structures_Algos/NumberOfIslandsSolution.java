import java.util.HashSet;

public class NumberOfIslandsSolution {

    public static int numIslands(char[][] grid) {
        int count = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    bfsGrid(grid, i, j);
                }
            }
        }
        return count;
    }


    public static void bfsGrid(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }

        grid[i][j] = '0';
        bfsGrid(grid, i-1, j);
        bfsGrid(grid, i+1, j);
        bfsGrid(grid, i, j-1);
        bfsGrid(grid, i, j+1);
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1','1','1','1','0'}, {'1', '1', '1', '0', '0'}};
        System.out.println(numIslands(grid));
    }
}
