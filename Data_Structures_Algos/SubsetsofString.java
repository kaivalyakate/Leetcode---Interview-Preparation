import java.util.ArrayList;
import java.util.List;

public class SubsetsofString{

    public static List<String> getSubset(String ans){
        List<String> subsets = new ArrayList<>();
        if(ans.equals("")){
            subsets.add("");
            return subsets;
        } else {
            subsets.add("");
        }
        for(int i=0;i<ans.length();i++){
            for(int j=i;j<ans.length();j++){
                subsets.add(ans.substring(i, j+1));
            }
        }

        return subsets;        
    }

    public static void main(String[] args) {
        
    }
}