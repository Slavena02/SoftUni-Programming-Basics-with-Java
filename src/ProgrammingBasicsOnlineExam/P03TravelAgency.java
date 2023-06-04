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
        double sumTotal = 0;

        if (city.equals("Bansko") || city.equals("Borovets")) {
            if (packageType.equals("withEquipment")) {
                pricePerDay = 100;
                sumTotal = pricePerDay * days;
                if ("yes".equals(vipDiscount)) {
                    sumTotal -= sumTotal * 0.10;
                } else {
                    sumTotal = pricePerDay * days;
                }
            } else if (packageType.equals("noEquipment")) {
                pricePerDay = 80;
                sumTotal = pricePerDay * days;
                if ("yes".equals(vipDiscount)) {
                    sumTotal -= sumTotal * 0.05;
                } else {
                    sumTotal = pricePerDay * days;
                }
            }
        } else if (city.equals("Varna") || city.equals("Burgas")) {
            if (packageType.equals("withBreakfast")) {
                pricePerDay = 130;
                sumTotal = pricePerDay * days;
                if ("yes".equals(vipDiscount)) {
                    sumTotal -= sumTotal * 0.12;
                } else {
                    sumTotal = pricePerDay * days;
                }
            } else if (packageType.equals("noBreakfast")) {
                pricePerDay = 100;
                if ("yes".equals(vipDiscount)) {
                    sumTotal -= sumTotal * 0.07;
                } else {
                    sumTotal = pricePerDay * days;
                }
            }
        } else {
            System.out.println("Invalid input!");
            return;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
            return;
        }

        if (days > 7) {
            sumTotal -= pricePerDay;
        }

        System.out.printf("The price is %.2flv! Have a nice time!", sumTotal);
    }
}
