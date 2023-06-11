package WhileLoopMoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());

        int transaction = 0;
        double sumCard = 0.00;
        double sumMoney = 0.00;
        double totalSum = 0;

        int cash = 0;
        int card = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int sum = Integer.parseInt(input);
            transaction++;

            if (transaction % 2 == 0) {
                if (sum < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    card++;
                    sumCard += sum;
                    totalSum += sum;
                    System.out.println("Product sold!");
                }

            } else {
                if (sum > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cash++;
                    sumMoney += sum;
                    totalSum += sum;
                    System.out.println("Product sold!");
                }
            }
            if (totalSum >= budget) {
                double averagesCard = sumCard / card;
                double averagesMoney = sumMoney / cash;
                System.out.printf("Average CS: %.2f%n", averagesMoney);
                System.out.printf("Average CC: %.2f%n", averagesCard);
            }
                input = scanner.nextLine();

        }
        System.out.println("Failed to collect required money for charity.");
    }
}
