import java.util.HashMap;

public class ColumnNumber {

    public static int GetColumnCount(String column) {
        int col = 0;
        for (int i = 0; i < column.length(); i++) {
            int n = column.charAt(i);
            col = col*26 + n;
        }
        return col;
    }

    public static void main(String[] args) {
        System.out.println(GetColumnCount("ZY"));
    }
}
