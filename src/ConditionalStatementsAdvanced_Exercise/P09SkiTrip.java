package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String blurb = scanner.nextLine();

        int night = day - 1;

        double roomForOnePerson = night * 18.00;
        double apartment = night * 25.00;
        double presidentApartment = night * 35.00;


        switch (type) {
            case "room for one person":
                switch (blurb) {
                    case "positive":
                        roomForOnePerson = roomForOnePerson + (roomForOnePerson * 0.25);
                        break;
                    case "negative":
                        roomForOnePerson = roomForOnePerson * 0.90;
                        break;
                }
                System.out.printf("%.2f", roomForOnePerson);
                break;
            case "apartment":
                if (day < 10) {
                    apartment = apartment * 0.70;
                } else if (day < 15) {
                    apartment = apartment * 0.65;
                } else {
                    apartment = apartment * 0.50;
                }
                switch (blurb) {
                    case "positive":
                        apartment = apartment + (apartment * 0.25);
                        break;
                    case "negative":
                        apartment = apartment * 0.90;
                        break;
                }
                System.out.printf("%.2f", apartment);
                break;
            case "president apartment":
                if (day < 10) {
                    presidentApartment = presidentApartment * 0.90;
                } else if (day < 15) {
                    presidentApartment = presidentApartment * 0.85;
                } else {
                    presidentApartment = presidentApartment * 0.80;
                }
                switch (blurb) {
                    case "positive":
                        presidentApartment = presidentApartment + (presidentApartment * 0.25);
                        break;
                    case "negative":
                        presidentApartment = presidentApartment * 0.90;
                        break;
                }
                System.out.printf("%.2f", presidentApartment);

                break;
        }
    }
}