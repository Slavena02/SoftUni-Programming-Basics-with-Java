package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P02Bike_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int juniorRacer = Integer.parseInt(scanner.nextLine());
        int seniorRacer = Integer.parseInt(scanner.nextLine());
        String route = scanner.nextLine();

        double feePriceJunior = 0.00;
        double feePriceSenior = 0.00;

        switch (route){

            case "trail":
                feePriceJunior = juniorRacer * 5.50;
                feePriceSenior = seniorRacer * 7.00;

                double totalFeeTrail = feePriceJunior + feePriceSenior;

                double totalSumTrail = totalFeeTrail * 0.95;
;
                System.out.printf("%.2f" , totalSumTrail);
                break;
            case "cross-country":
                feePriceJunior = juniorRacer * 8.00;
                feePriceSenior = seniorRacer * 9.50;

                double totalFeeCrossCountry = feePriceJunior + feePriceSenior;

                int racers = juniorRacer + seniorRacer ;
                if (racers >= 50){
                    totalFeeCrossCountry = totalFeeCrossCountry * 0.75;
                }
                double totalSumCrossCountry = totalFeeCrossCountry * 0.95;

                System.out.printf("%.2f" , totalSumCrossCountry);
                break;
            case "downhill":
                feePriceJunior = juniorRacer * 12.25;
                feePriceSenior = seniorRacer * 13.75;

                double totalFeeDownhill = feePriceJunior + feePriceSenior;

                double totalSumDownhill = totalFeeDownhill * 0.95;

                System.out.printf("%.2f" , totalSumDownhill);
                break;
            case "road":
                feePriceJunior = juniorRacer * 20.00;
                feePriceSenior = seniorRacer * 21.50;

                double totalFeeRoad = feePriceJunior + feePriceSenior;

                double totalSumRoad = totalFeeRoad * 0.95;

                System.out.printf("%.2f",totalSumRoad);
        }



    }
}
