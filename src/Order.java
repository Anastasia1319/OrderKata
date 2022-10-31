import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Order {
    public static String orderOne(String words) {
        List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        StringTokenizer str = new StringTokenizer(words);
        String[] newString = new String[str.countTokens()];

        while (str.hasMoreTokens()) {
            String thisWord = str.nextToken();
            for (int i = 0; i < thisWord.length(); i++) {
                if (numbers.contains(thisWord.charAt(i))) {
                    newString[numbers.indexOf(thisWord.charAt(i))] = thisWord;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String c : newString) {
            if(c == null) continue;
            sb.append(c + " ");
        }
        if (sb.isEmpty()) {
            return "This string is null!";
        }
        else {
            return sb.toString().trim();
        }
    }
}
