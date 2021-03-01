import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TagExtractor {

    public static List<List<String>> ExtractText(List<String> queries) {
        List<List<String>> finalExtractedList = new ArrayList<>();
        for (String xml : queries) {
            int i = 0;
            Stack<String> openingClosingTag = new Stack<>();
            List<String> extractedText = new ArrayList<>();
            while (i < xml.length()) {
                if (xml.charAt(i) == '<' && xml.charAt(i + 1) == '/') {
                    String top = openingClosingTag.peek();
                    if (!top.equals(xml.substring(i + 2, xml.indexOf(">", i + 2)))) {
                        break;
                    } else {
                        openingClosingTag.pop();
                    }
                    // closingTag += xml.substring(i + 2, xml.indexOf(">", i + 2));
                } else if (xml.charAt(i) == '<') {
                    // openingTag += xml.substring(i + 1, xml.indexOf(">", i));
                    openingClosingTag.push(xml.substring(i + 1, xml.indexOf(">", i)));
                    String text = xml.substring(xml.indexOf(">", i) + 1, xml.indexOf("<", xml.indexOf(">", i) + 1));
                    if (!text.isEmpty()) {
                        extractedText.add(text);
                    }
                }
                i++;
            }
            if (!openingClosingTag.isEmpty()) {
                finalExtractedList.add(null);
            } else {
                finalExtractedList.add(extractedText);
            }
        }
        return finalExtractedList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<String> xml = new ArrayList<>();
        while (testCases > 0) {
            String line = in.nextLine();
            xml.add(line);
            // Write your code here
            testCases--;
        }
        List<List<String>> extractedText = ExtractText(xml);
        for (List<String> a1 : extractedText) {
            if (a1 != null) {
                if (a1.size() == 1) {
                    System.out.println(a1.get(0));
                } else {
                    for (String a : a1) {
                        System.out.println(a);
                    }
                }
            } else {
                System.out.println("None");
            }
        }
        in.close();
    }
}

// netstat -anp | grep ':6390'
// fuser -k 6390/tcp