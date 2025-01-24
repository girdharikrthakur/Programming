public class MaxOccuranceAndSecondMaxChar {

    public static void main(String[] args) {

        String str = "This is Hound";

        int[] track = new int[256];
        char secondMaxChar = ' ';
        char maxChar = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {

            if (c != ' ') {
                track[c]++;

                if (track[c] > maxCount) {
                    maxChar = c;
                    maxCount = track[c];

                } else if (maxCount == track[c] && maxChar != secondMaxChar) {
                    secondMaxChar = c;
                }

            }

        }
        System.out.println("============================================================");

        System.out.println("\n Max Character " + maxChar + "\t Max Count: " + maxCount + "\t \n Second Max Char is: "
                + secondMaxChar + "\n");

        System.out.println("=============================================================");

    }
}