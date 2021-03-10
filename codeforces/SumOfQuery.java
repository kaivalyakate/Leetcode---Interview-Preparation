import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfQuery {

    public static int CalculateQuerySum(List<Integer> array, int l, int r){
        int i = l-1, sum = 0;
        r = r-1;
        while(i<=r){
            if(i==r){
                sum+=array.get(i);
            } else {
                sum += array.get(i) + array.get(r);
            }
            i+=1;
            r-=1;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<List<Integer>> answers = new ArrayList<>();
        while(t!=0){
            int n = sc.nextInt();
            List<Integer> array = new ArrayList<>();
            for(int i=0;i<n;i++){
                array.add(sc.nextInt());
            }
            int q = sc.nextInt();
            List<Integer> queries = new ArrayList<>();
            for(int i=0;i<q*2;i++){
                queries.add(sc.nextInt());
            }
            List<Integer> ansSum = new ArrayList<>();
            for(int i=0;i<q*2;i+=2){
                ansSum.add(CalculateQuerySum(array, queries.get(i), queries.get(i+1)));
            }
            answers.add(ansSum);
            t--;
        }
        for(List<Integer> x: answers){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
