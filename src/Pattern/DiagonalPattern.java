package Pattern;

public class DiagonalPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.println("* ");

                }
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
