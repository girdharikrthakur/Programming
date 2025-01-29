package Array;

public class FindANumber {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 34, 40, 55, 44, 55, 12, 34, 20, 20 };
        int find = 20;
        boolean found = false;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Found " + find + " " + ++count + " " + "at index: " + i);
                found = true;

            }

        }

        if (!found) {
            System.out.println("Not Found");
        }

    }
}
