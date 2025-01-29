package Array;

public class isEven {

    public static void main(String[] args) {

        int[] arr = { 12, 23, 445, 5, 67, 887, 5, 2 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + ": isEven");
            }
        }
    }

}
