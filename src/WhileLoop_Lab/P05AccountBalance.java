package WhileLoop_Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double money = 0;
        while (!input.equals("NoMoreMoney")) {
            double output = Double.parseDouble(input);
            if (output <= 0) {
                System.out.println("Invalid operation!");
            } else {
                System.out.printf("%.2f%n", output);
                money += output;
            }
                input = scanner.nextLine();

        }
            System.out.printf("Total: %.2f", money);
        }
    }
