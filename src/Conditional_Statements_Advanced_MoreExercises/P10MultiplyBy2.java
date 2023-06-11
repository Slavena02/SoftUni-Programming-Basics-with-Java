package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < 0) {
                System.out.println("Negative number!");
                break;
            }

            double result = number * 2;
            System.out.printf("Result: %.2f%n", result);
        }
    }
}
