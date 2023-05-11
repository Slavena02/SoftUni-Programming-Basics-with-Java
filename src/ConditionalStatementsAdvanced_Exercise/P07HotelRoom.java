package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));


        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());

        String studioOrApartment = " ";
        double priceStudio = 0.00;
        double priceApartment = 0.00;
        double oneNightPrice = 0.00;

        if (month.equals("May") || month.equals("October")) {
            if (night > 14) {
                studioOrApartment = "Studio";
                oneNightPrice = 50.00 - (50.00 * 0.30);
                priceStudio = night * oneNightPrice;

                studioOrApartment = "Apartment";
                oneNightPrice = 65.00 - (65.00 * 0.10);
                priceApartment = night * oneNightPrice;
            }
        } else {
            studioOrApartment = "Studio";
            oneNightPrice = 50.00 - (50.00 * 0.10);
            priceStudio = night * oneNightPrice;

            studioOrApartment = "Apartment";
            oneNightPrice = 65.00 - (65.00 * 0.10);
            priceApartment = night * oneNightPrice;
        }

        if (month.equals("June") || month.equals("September")) {
            if (night > 14) {
                studioOrApartment = "Studio";
                oneNightPrice = 75.20 - (75.20 * 0.20);
                priceStudio = night * oneNightPrice;

                studioOrApartment = "Apartment";
                oneNightPrice = 68.70 - (68.70 * 0.10);
                priceApartment = night * oneNightPrice;
            }else {
                studioOrApartment = "Studio";
                priceStudio = night * 75.20;

                studioOrApartment = "Apartment";
                priceApartment = night * 68.70;
            }

        }
        if (month.equals("July") || month.equals("August")) {
            studioOrApartment = "Studio";
            priceStudio = night * 76.00;

            studioOrApartment = "Apartment";
            if (night > 14) {
                oneNightPrice = 77.00 - (77.00 * 0.10);
                priceApartment = night * oneNightPrice;
            }else{
                priceApartment = night * 77.00;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}



