package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double pricePerDay;

        switch (city) {
            case "Bansko":
            case "Borovets":
                if (packageType.equals("noEquipment")) {
                    pricePerDay = 80;
                } else if (packageType.equals("withEquipment")) {
                    pricePerDay = 100;
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;
            case "Varna":
            case "Burgas":
                if (packageType.equals("noBreakfast")) {
                    pricePerDay = 100;
                } else if (packageType.equals("withBreakfast")) {
                    pricePerDay = 130;
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }

        double totalPrice = pricePerDay * days;

        if (days > 7) {
            totalPrice -= pricePerDay;
        }

        if (vipDiscount.equals("yes")) {
            double discount = 0;
            if (city.equals("Bansko") || city.equals("Borovets")) {
                discount = 0.1;
            } else if (city.equals("Varna") || city.equals("Burgas")) {
                discount = 0.12;
            }
            totalPrice -= totalPrice * discount;
        } else if (!vipDiscount.equals("no")) {
            System.out.println("Invalid input!");
            return;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2f lv! Have a nice time!", totalPrice);
        }
    }
}



