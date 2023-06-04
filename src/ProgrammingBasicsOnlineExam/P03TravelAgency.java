package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double pricePerDay = 0;
        double totalSum = 0.00;
        double discount = 0;
        switch (city) {
            case "Bansko":
            case "Borovets":
                if (packageType.equals("noEquipment")) {
                    pricePerDay = 80;
                    totalSum = pricePerDay * days;
                    switch (vipDiscount) {
                        case "yes":
                            discount = 0.05;
                            totalSum = pricePerDay * days;
                            totalSum -= totalSum * discount;
                            break;
                        case "no":
                            totalSum = pricePerDay * days;
                            break;
                    }
                } else if (packageType.equals("withEquipment")) {
                    pricePerDay = 100;
                    switch (vipDiscount) {
                        case "yes":
                            totalSum = pricePerDay * days;
                            discount = 0.10;
                            totalSum -= totalSum * discount;
                            break;
                        case "no":
                            totalSum = pricePerDay * days;
                            break;
                    }
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;
            case "Varna":
            case "Burgas":
                if (packageType.equals("noBreakfast")) {
                    pricePerDay = 100;
                    switch (vipDiscount) {
                        case "yes":
                            totalSum = pricePerDay * days;
                            discount = 0.07;
                            totalSum -= totalSum * discount;
                            break;
                        case "no":
                            totalSum = pricePerDay * days;
                            break;
                    }
                } else if (packageType.equals("withBreakfast")) {
                    pricePerDay = 130;
                    switch (vipDiscount) {
                        case "yes":
                            totalSum = pricePerDay * days;
                            discount = 0.12;
                            totalSum -= totalSum * discount;
                            break;
                        case "no":
                            totalSum = pricePerDay * days;
                            break;
                    }
                }
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }

        if (days > 7) {
            totalSum -= pricePerDay;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
        }
    }
}



