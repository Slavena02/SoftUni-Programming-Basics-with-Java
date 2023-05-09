package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        String result = " ";
        double result2 = 0.00;

        if (num1 == 0 || num2 == 0) {
            System.out.printf("Cannot divide %.0f by zero", num1);
        }

        if (symbol.equals("+")) {
            result2 = num1 + num2;
            if (result2 % 2 == 0) {
                result = "even";
            } else {
                result = "odd";
            }
            System.out.printf("%.0f %s %d = %.0f - %s", num1, symbol, num2, result2, result);
        } else if (symbol.equals("-")) {
            result2 = num1 - num2;
            if (result2 % 2 == 0) {
                result = "even";
            } else {
                result = "odd";
            }
            System.out.printf("%.0f %s %d = %.0f - %s", num1, symbol, num2, result2, result);
        } else if (symbol.equals("*")) {
            result2 = num1 * num2;

            if (result2 % 2 == 0) {
                result = "even";
            } else {
                result = "odd";
            }
            System.out.printf("%.0f %s %d = %.0f - %s", num1, symbol, num2, result2, result);

        } else if (symbol.equals("/")) {
            result2 = num1 / num2;

            System.out.printf("%.0f / %d = %.2f", num1, num2, result2);

        } else if (symbol.equals("%")) {
            result2 = num1 % num2;
            System.out.printf("%.0f %s %d = %.0f", num1, symbol, num2, result2);
        }
    }
}


