import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "Pizza";
        StringBuilder newString = new StringBuilder();

        Set<Character> track = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (track.add(c)) {
                newString.append(c);
            }
        }
        System.out.println(newString);
    }
}
