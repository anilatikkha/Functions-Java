package Functions;

//import java.util.Scanner;

public class Prime {
    /**
     * @param n
     * @return
     */
    public static void prime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                // System.out.println("The number is prime: " + isPrime);
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("\nthe number is prime.\n");
        } else {
            System.out.println("\nthe number is not a prime number.\n");
        }
    }

    public static void main(String[] args) {
        /*
         * System.out.print("Enter the number: ");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         */
        prime(21);
        // sc.close();
    }
}
