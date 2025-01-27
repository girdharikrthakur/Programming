package Pattern;

public class RightTrinagle {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == j || i > j) {
                    System.out.print("* ");

                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}

/*

*
**
***
****

 */
