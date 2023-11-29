package More;

import java.util.Locale;
import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if (day.equals("Weekday")) {
            if (age >=0 && age <= 18 || age > 64 && age <= 122) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        } else if (day.equals("Weekend")) {
            if (0 <= age && age <= 18 || age > 64 && age <= 122) {
                price = 15;
            } else if (age > 18 && age <= 64) {
            }
        } else if (day.equals("Holiday"))
            if (0 <= age && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        if (price != 0) {
            System.out.println(price);
        } else {
            System.out.println("Error!");
        }

    }

}
