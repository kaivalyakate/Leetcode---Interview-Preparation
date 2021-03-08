import java.util.Scanner;

public class BeautifulMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minMoves = 0;
        int[] pos = new int[]{0, 0};

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                String row = sc.next();
                if(row.equals("1")){
                    pos[0] = i;
                    pos[1] = j;
                }
            }
            sc.nextLine();
        }

        if(pos[0]==2 && pos[1]==2){
            System.out.println(minMoves);
        } else{
            minMoves+=Math.abs(2-pos[0]);
            minMoves+=Math.abs(2-pos[1]);
            System.out.println(minMoves);
        }
        sc.close();
    }
}
