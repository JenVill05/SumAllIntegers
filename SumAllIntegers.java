// SumAllIntegers.java

import java.util.Scanner;

public class SumAllIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter integers to sum. Enter 0 to finish:");

        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Total sum of all entered integers: " + sum);
        scanner.close();
    }
}
