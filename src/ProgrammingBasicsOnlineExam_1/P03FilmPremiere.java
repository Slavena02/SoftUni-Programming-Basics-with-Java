package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        String packages = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());

        double ticketsPrice = 0.00;
        double totalSum = 0.00;
        double discount = 0.00;

        switch (projection) {
            case "John Wick":
                switch (packages) {
                    case "Drink":
                        ticketsPrice = 12.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                    case "Popcorn":
                        ticketsPrice = 15.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                    case "Menu":
                        ticketsPrice = 19.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                }
                break;
            case "Star Wars":
                switch (packages) {
                    case "Drink":
                        ticketsPrice = 18.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                    case "Popcorn":
                        ticketsPrice = 25.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                    case "Menu":
                        ticketsPrice = 30.00;
                        totalSum = countTickets * ticketsPrice;

                        if (countTickets >= 4) {
                            discount = totalSum - (totalSum * 0.30);
                            totalSum = totalSum - discount;
                        }
                }
                break;
            case "Jumanji":
                switch (packages) {
                    case "Drink":
                        ticketsPrice = 9.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                    case "Popcorn":
                        ticketsPrice = 11.00;
                        totalSum = countTickets * ticketsPrice;
                        break;
                    case "Menu":
                        ticketsPrice = 14.00;
                        totalSum = countTickets * ticketsPrice;
                        if (countTickets == 2) {
                            discount = totalSum - (totalSum * 0.15);
                            totalSum = totalSum - discount;
                        }
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva." , totalSum);

    }
}
