package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double sum = 0;
        String result = " ";

        switch (symbol) {
            case "+":
                sum = num1 + num2;
                if (sum % 2 == 0) {
                    result = "even";
                } else {
                    result = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", num1, symbol, num2, sum, result);
                break;

            case "-":
                sum = num1 - num2;
                if (sum % 2 == 0) {
                    result = "even";
                } else {
                    result = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", num1, symbol, num2, sum, result);
                break;

            case "*":
                sum = num1 * num2;

                if (sum % 2 == 0) {
                    result = "even";
                } else {
                    result = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", num1, symbol, num2, sum, result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    double sum0 = num1*1.0 / num2;
                    System.out.printf("%d %s %d = %.2f", num1, symbol, num2, sum0);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    double sum0 = num1 % num2;
                    System.out.printf("%d %s %d = %.0f", num1, symbol, num2, sum0);
                }
        }
    }
}
