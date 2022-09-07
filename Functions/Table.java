package Functions;

import java.util.Scanner;

public class Table {
    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            int t = num * i;
            System.out.println(num + " X " + i + " = " + t);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        table(num);

    }
}
