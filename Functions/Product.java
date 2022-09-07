package Functions;

import java.util.Scanner;

public class Product {
    public static void mul(int a, int b) {
        int mul = a * b;
        System.out.println("The product of and b is: " + mul);
    }

    public static void main(String args[]) {
        System.out.println("Enter the values of a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the values of a:");
        int b = sc.nextInt();
        sc.close();
        // int a=9;
        // int b=10;
        mul(a, b);
    }
}
