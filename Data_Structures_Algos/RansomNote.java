import java.util.HashMap;

public class RansomNote {

    public static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> ransomNote = new HashMap<String, Integer>();
        int j = 0;
        for (int i = 0; i < magazine.length; i++) {
            ransomNote.put(magazine[i].toLowerCase(), i);
        }
        for (int i = 0; i < note.length; i++) {
            if (note[i].equals(magazine[ransomNote.get(note[i].toLowerCase())])) {
                j += 1;
            }
        }
        if (j == note.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        String[] magazine = "abc d".split("");
        System.out.println();
        // String[] note = { "two", "times", "two", "is", "four" };
        // checkMagazine(magazine, note);
    }

}

// Incomplete
