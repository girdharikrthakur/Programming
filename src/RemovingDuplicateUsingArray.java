public class RemovingDuplicateUsingArray {

    public static void main(String[] args) {

        int[] track = new int[256];

        String str = "Pizza112 233";
        StringBuilder newString = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                track[c]++;

                if (track[c] == 1) {
                    newString.append(c);
                }
            }
        }
        System.out.println(newString);

    }

}
