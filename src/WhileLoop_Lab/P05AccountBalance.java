package WhileLoop_Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double totalAmount = 0;

                while (true) {
                    String input = scanner.nextLine();

                    if (input.equals("NoMoreMoney")) {
                        break;
                    }

                    double amount;
                    try {
                        amount = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid operation!");
                        return;
                    }

                    if (amount < 0) {
                        System.out.println("Invalid operation!");
                        return;
                    }

                    System.out.printf("Increase: %.2f%n", amount);
                    totalAmount += amount;
                }

                System.out.printf("Total: %.2f%n", totalAmount);
            }
        }
