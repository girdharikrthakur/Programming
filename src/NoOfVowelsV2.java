import java.util.Scanner;

public class NoOfVowelsV2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        System.out.println("Enter String to Ckeck for Vowels");
        String input = scn.nextLine();
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (inputArray[i] == vowels[j]) {
                    System.out.println("Vowels Vowels in the String are: " + inputArray[i] + " And Index is: " + i);
                }
            }
        }
        scn.close();
    }
}
