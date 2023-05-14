package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceForApartment = 0;
        double priceForStudio = 0;

        //правим switch за месеците

        //– May, June, July, August, September или October

        switch (month){
            case "May":
            case "October":
                //пресмятаме цената за общия брой нощувки
                priceForApartment = countNights * 65;
                priceForStudio = countNights * 50;

                //проверяваме дали имаме отстъпка при повече от 7, 14 нощувки
                if(countNights > 14){
                    priceForStudio = priceForStudio * 0.7;
                    priceForApartment = priceForApartment * 0.9;
                } else if (countNights > 7) {
                    priceForStudio = priceForStudio * 0.95;
                }
                break;

            case "June":
            case "September":

                priceForApartment = countNights * 68.70;
                priceForStudio = countNights * 75.20;

                if(countNights > 14){

                    priceForApartment = priceForApartment * 0.9;
                    priceForStudio = priceForStudio * 0.8;

                }
                break;

            case "July":
            case "August":
                priceForApartment = countNights * 77;
                priceForStudio = countNights * 76;

                if(countNights > 14){
                    priceForApartment = priceForApartment * 0.9;
                }

                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForStudio);


    }
}

