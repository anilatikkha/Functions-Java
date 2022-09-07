package Functions;

import java.util.Scanner;

public class Even {
    public static void even(int num) {
        if (num % 2 == 0) {
            System.out.print(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        even(num);
        sc.close();
    }
}
