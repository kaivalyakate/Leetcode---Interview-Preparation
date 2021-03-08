import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingTheUniverse {

    public static int MinimumSwitch(List<String> queries, List<String> searchEngines){
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t!=0){
            List<String> searchEngines = new ArrayList<>();
            int nSe = sc.nextInt();
            for(int i=0;i<nSe;i++){
                searchEngines.add(sc.next());
            }
            int q = sc.nextInt();
            List<String> queries = new ArrayList<>();
            for(int i=0;i<q;i++){
                queries.add(sc.next());
            }
            t-=1;
        }
        sc.close();
    }
}
