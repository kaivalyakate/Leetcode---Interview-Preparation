public class StringSort {

    public static char[] SortString(String str, int[] array) {
        char[] strChar = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp1 = array[i];
            array[i] = array[min];
            array[min] = temp1;
            char temp = strChar[i];
            strChar[i] = strChar[min];
            strChar[min] = temp;
        }
        return strChar;
    }

    public static void main(String[] args) {
        int[] array = { 7, 1, 2, 4, 8, 5 };
        String str = "ABCDEF";
        char[] ans = SortString(str, array);
        for(char x: ans){
            System.out.println(x);
        }
    }
}
