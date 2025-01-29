package Number;

public class PrimeNoCheck {
    public static void main(String[] args) {

        int num = 8;

        if (isPrime(num)) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Not a Prime");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
