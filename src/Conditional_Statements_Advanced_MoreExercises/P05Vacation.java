package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String accommodation = "";
        double price = 0.0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.45;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.8;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.6;
            }
        } else {
            accommodation = "Hotel";
            if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.9;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                price = budget * 0.9;
            }
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
