package String;

import java.util.Scanner;

public class NoOfVowels {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = "aeiouAEIOU";
        String input = scn.nextLine();
        int count = 0;

        for (char c : input.toCharArray()) {
            if (str.contains(Character.toString(c))) {
                count++;
                System.out.println("Vowels: " + c);
            }

        }

        System.out.println(count);

        scn.close();

    }
}
