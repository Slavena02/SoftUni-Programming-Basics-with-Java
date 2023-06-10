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
        double sum = 0.00;
        switch (season){
            case "Spring":
            case "Summer":
                priceChrysanthemums = 2.00 * countChrysanthemums;
                priceRoses = 4.10 * countRoses;
                priceTulips = 2.50 * countTulips;
                sum = priceChrysanthemums + priceRoses + priceTulips;
                switch (yOrN){
                    case "Y":
                        sum = priceChrysanthemums + priceRoses + priceTulips;
                        sum = sum + (sum * 0.15);
                        break;
                    case "N":
                        sum = priceChrysanthemums + priceRoses + priceTulips;
                        break;
                }
                break;
            case "Autumn":
            case "Winter":
                priceChrysanthemums = 3.75 * countChrysanthemums;
                priceRoses = 4.50 * countRoses;
                priceTulips = 4.15 * countTulips;
                sum = priceChrysanthemums + priceRoses + priceTulips;
                switch (yOrN){
                    case "Y":
                        sum = sum + (sum * 0.15);
                        break;
                    case "N":
                        sum = priceChrysanthemums + priceRoses + priceTulips;
                }
                break;

        }
        int sumFlower = countChrysanthemums + countRoses + countTulips;

        if (sumFlower > 20){
            sum = sum - (sum * 0.20);
        }
        if (season.equals("Spring")) {
            if (countTulips > 7) {
                sum = sum - (sum * 0.05);
            }
        }
        if(season.equals("Winter")) {
            if (countRoses >= 10) {
                sum = sum - (sum * 0.10);
            }
        }


        System.out.printf("%.2f" ,sum + 2.00);

    }
}

