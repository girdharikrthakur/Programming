package String;

public class Palindrome {

    public static void main(String[] args) {

        String str = "aabaa";

        if (rev(str)) {
            System.out.println("is a Palindrome");

        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean rev(String check) {
        String rev = "";

        for (char c : check.toCharArray()) {
            rev = c + rev;
        }

        return check.equals(rev);

    }
}
