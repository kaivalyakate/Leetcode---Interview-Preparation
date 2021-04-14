import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendsGame {

    public static int findTheWinner(int n, int k) {
        List<Integer> friendsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            friendsList.add(i);
        }

        int i = 0;
        while (friendsList.size() != 1) {
            i = (i + (k - 1)) % friendsList.size();
            friendsList.remove(i);
        }
        return friendsList.get(0);
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4 };
        System.out.println(findTheWinner(5, 2));
    }
}
