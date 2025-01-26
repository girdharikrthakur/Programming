import java.util.Scanner;

public class CharMaxOccuranceV2 {
    static int[] track = new int[266];
    static char c = ' ';

    public static void main(String[] args) {
        System.out.println("Enter String to Check for Maximum occurance of a character");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int maxCount = 0;
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                track[c]++;

                if (track[c] > maxCount) {
                    maxCount = track[c];
                }
            }
        }
        for (int i = 0; i < track.length; i++) {
            if (track[i] == maxCount) {
                c = (char) i;
                System.out.println("Max Occuraing Character: " + c + "\t " + "Occurance: " + maxCount);
            }
        }
        scn.close();

    }

}