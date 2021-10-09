public class KthSymbolInGrammar {
    
    public static int kthGrammar(int n, int k) {
        String result = "0";
        for(int i=1;i<n;i++){
            String temp = "";
            for(Character x: result.toCharArray()){
                if(x=='0'){
                    temp+="01";
                } else if(x=='1'){
                    temp+="10";
                }
            }
            result = temp;
        }
        return Integer.parseInt(result.substring(k-1, k));
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(3, 1));
    }
}
