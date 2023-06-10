package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemums = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips= Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yOrN = scanner.nextLine();

        double priceChrysanthemums = 0.00;
        double priceRoses = 0.00;
        double priceTulips = 0.00;
        switch (season){
            case "Spring":
            case "Summer":
                priceChrysanthemums = 2.00 * countChrysanthemums;
                priceRoses = 4.10 * countRoses;
                priceTulips = 2.50 * countTulips;
                switch (yOrN){
                    case "Y":
                        break;
                    case "N":
                        break;
                }
                break;
            case "Аutumn":
            case "Winter":
                priceChrysanthemums = 3.75 * countChrysanthemums;
                priceRoses = 4.50 * priceRoses;
                priceTulips = 4.15 * priceTulips;
                switch (yOrN){
                    case "Y":
                        break;
                    case "N":
                        break;
                }
                break;

        }


    }
}

