import java.util.*;
public class PascalTriangleJava {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> prev = Arrays.asList(new Integer[]{1, 1});
        if(rowIndex==0){
            return Arrays.asList(new Integer[]{1});
        }
        for(int i=3;i<=rowIndex+1;i++){
            Integer[] temp = new Integer[i];
            temp[0] = 1;
            temp[temp.length-1] = 1;
            for(int j=1;j<temp.length-1;j++){
                temp[j] = prev.get(j-1)+prev.get(j);
            }
            prev = Arrays.asList(temp);
        }
        return prev;
    }
    

    public static void main(String[] args) {
        List<Integer> ans = getRow(4);
        System.out.println(ans);
    }
}
