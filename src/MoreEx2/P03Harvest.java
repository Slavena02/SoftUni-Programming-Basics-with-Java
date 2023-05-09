package MoreEx2;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areaTheVineyard = Integer.parseInt(scanner.nextLine());
        double grapeOneSquareMeter = Double.parseDouble(scanner.nextLine());
        int neededLitresWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double totalGrape =  areaTheVineyard * grapeOneSquareMeter;

        double totalWine = 0.4 * totalGrape  / 2.5;

        if (totalWine < neededLitresWine){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed." , neededLitresWine - totalWine);
        }
        if (totalWine >= neededLitresWine ){

            double excessWine = totalWine - neededLitresWine;

            System.out.printf("Good harvest this year! Total wine: %.0f liters." , totalWine);
            System.out.printf("%.0f liters left -> %.0f liters per person." , excessWine, excessWine / workers);
        }


    }

}
