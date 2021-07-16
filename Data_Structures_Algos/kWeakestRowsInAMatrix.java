import java.util.*;

public class kWeakestRowsInAMatrix {

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] countArr = new int[mat.length];
        int[] ans = new int[k];
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                } else break;
            }
            countArr[i] = count*1000+i;
        }

        Arrays.sort(countArr);
        for(int i=0;i<k;i++){
            ans[i] = countArr[i]%1000;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[7][3];
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(kWeakestRows(mat, 6).toString());

        sc.close();
    }
}


// 1 1 0 
// 1 1 0
// 1 1 1 
// 1 1 1
// 0 0 0
// 1 1 1
// 1 0 0