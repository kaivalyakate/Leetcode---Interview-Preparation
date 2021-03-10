import java.util.Scanner;

public class NewYearCandies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candles = sc.nextInt();
        int combineCandles = sc.nextInt();
        int noOfHours = candles;
        while (candles/combineCandles > 0) {
                noOfHours += candles/combineCandles;
                candles = candles / combineCandles + candles%combineCandles; 
        }
        System.out.println(noOfHours);
        sc.close();
    }
}