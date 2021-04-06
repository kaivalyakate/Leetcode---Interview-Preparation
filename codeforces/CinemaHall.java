import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CinemaHall {

    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        Arrays.sort(reservedSeats, Comparator.comparingInt(c -> c[0]));
        for (int i = 0; i < reservedSeats.length; i++) {
            int seatNo = reservedSeats[i][1];
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        int[][] reservedSeats = new int[][] { {1,4}, {1, 5},{1,6},{1,7},{2,2},{2,3},{2,7},{2,8},{2,9},{2,10} };
        System.out.println(maxNumberOfFamilies(n, reservedSeats));
    }
}
