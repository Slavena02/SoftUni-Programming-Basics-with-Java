package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());

        double price = 0.00;
        double totalSum = 0.00;

        switch (destination) {
            case "Dubai":
                switch (season) {
                    case "Summer":
                        price = 40000.00;
                        totalSum = day * price;
                        break;
                    case "Winter":
                        price = 45000.00;
                        totalSum = day * price;
                        break;
                }
                break;
            case "Sofia":
                switch (season) {
                    case "Summer":
                        price = 12500.00;
                        totalSum = day * price;
                        break;
                    case "Winter":
                        price = 17000.00;
                        totalSum = day * price;
                        break;
                }
                break;
            case "London":
                switch (season) {
                    case "Summer":
                        price = 20250.00;
                        totalSum = day * price;
                        break;
                    case "Winter":
                        price = 24000.00;
                        totalSum = day * price;
                        break;
                }
                break;

        }
        if (destination.equals("Dubai")) {
            totalSum = totalSum - (totalSum * 0.30);
        } else if (destination.equals("Sofia")) {
            totalSum = totalSum + (totalSum * 0.15);
        }

        if (budget >= totalSum) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalSum - budget);
        }
    }
}
