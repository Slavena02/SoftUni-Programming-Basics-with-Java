package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSerial = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;
        String input = scanner.nextLine();

        for (int i = 1; i <= countSerial; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            double discountedPrice = price;

            switch (input) {
                case "Thrones":
                    discountedPrice -= price * 0.50;
                    break;
                case "Lucifer":
                    discountedPrice -= price * 0.40;
                    break;
                case "Protector":
                    discountedPrice -= price * 0.30;
                    break;
                case "TotalDrama":
                    discountedPrice -= price * 0.20;
                    break;
                case "Area":
                    discountedPrice -= price * 0.10;
                    break;
            }

            if (budget < discountedPrice) {
                break;
            }

            budget -= discountedPrice;
            sum += discountedPrice;
            input = scanner.nextLine();
        }

        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - sum);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", sum - budget);
        }
    }
}