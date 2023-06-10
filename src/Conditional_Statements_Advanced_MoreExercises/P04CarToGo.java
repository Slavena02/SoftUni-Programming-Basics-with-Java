package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double cabrio = 0.00;
        double jeep = 0.00;

        if (budget <= 100) {
            System.out.println("Economy class");
            switch (season) {
                case "Summer":
                    cabrio = budget - (budget * 0.35);
                    System.out.printf("Cabrio - %.2f" , cabrio);
                    break;
                case "Winter":
                    jeep = budget - (budget * 0.65);
                    System.out.printf("Jeep - %.2f" , jeep);
                    break;
            }
        } else if (budget < 500) {
            System.out.println("Compact class");
            switch (season) {
                case "Summer":
                    cabrio = budget - (budget * 0.45);
                    System.out.printf("Cabrio - %.2f" , cabrio);
                    break;
                case "Winter":
                    jeep = budget - (budget * 0.80);
                    System.out.printf("Jeep - %.2f" , jeep);
                    break;
            }
        } else {
            System.out.println("Luxury class");
            switch (season) {
                case "Summer":
                case "Winter":
                    jeep = budget - (budget * 0.90);
                    System.out.printf("Jeep - %.2f" , jeep);
                    break;
            }
        }
    }
}
