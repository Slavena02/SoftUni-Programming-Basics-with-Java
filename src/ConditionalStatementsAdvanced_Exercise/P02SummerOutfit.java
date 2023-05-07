package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        String outfit = " ";
        String shoes = " ";

        if (day.equals("Morning")) {

            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
           if (day.equals("Afternoon")) {
               if (degrees >= 10 && degrees <= 18) {
                   outfit = "Shirt";
                   shoes = "Moccasins";
               } else if (degrees <= 24) {
                   outfit = "T-Shirt";
                   shoes = "Sandals";
               } else {
                   outfit = "Swim Suit";
                   shoes = "Barefoot";
               }
           }

        if (day.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}


