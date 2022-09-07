package Functions;

import java.util.Scanner;

public class Factorial {
    public static int fact(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            n = n * i;
        }
        return n;
    }

    public static void main(String[] agrs) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = fact(num);
        sc.close();
        System.out.println("The factorial of number is: " + f);

    }
}
