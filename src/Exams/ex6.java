package Exams;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            double expectedAverageGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            double totalGold = 0.0;

            for (int j = 1; j <= days; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalGold += goldPerDay;
            }

            double averageGoldPerDay = totalGold / days;

            if (averageGoldPerDay >= expectedAverageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            } else {
                System.out.printf("You need %.2f gold.%n",expectedAverageGold - averageGoldPerDay );
            }
        }
    }
}
