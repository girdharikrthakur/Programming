import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceUsingHasMap {

    public static void main(String[] args) {

        char maxChar = ' ';
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();

        String str = "This is Hound";

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);

                if (map.get(c) > maxCount) {
                    maxCount = map.get(c);
                    maxChar = c;
                }
            }
        }

        System.out.println(maxChar);
        System.out.println(maxCount);
    }
}