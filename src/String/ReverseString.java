package String;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String input = scn.nextLine();

        String reversedString = "";
        for (char character : input.toCharArray()) {

            reversedString = character + reversedString;
        }
        System.out.println("Reversed String is :" + reversedString);
        scn.close();

    }

}
