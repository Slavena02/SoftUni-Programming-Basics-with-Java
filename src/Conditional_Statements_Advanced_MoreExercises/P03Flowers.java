package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner (System.in);

        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        double chrysanthemumsPrice = 0.00;
        double rosesPrice = 0.00;
        double tulipsPrice = 0.00;
        int totalFlowers = chrysanthemumsCount + rosesCount + tulipsCount;

        double totalSum = 0.00;
        switch (season){
            case "Spring" :
            case "Summer":
                switch (day){
                    case "Y":
                        chrysanthemumsPrice = chrysanthemumsCount * 2.00;
                        rosesPrice = rosesCount * 4.10;
                        tulipsPrice = tulipsCount * 2.50;

                        double sum = chrysanthemumsPrice + rosesPrice + tulipsPrice ;

                        totalSum = sum - (sum * 0.15);

                        if (tulipsCount > 7) {
                            totalSum = sum - (sum * 0.05);
                        }

                        if (totalFlowers > 20){
                            totalSum = totalSum * 0.80;
                        }

                        double totalSumPrice = totalSum + 2.00;

                        System.out.printf("%.2f" , totalSumPrice);
                        break;
                    case "N" :
                        chrysanthemumsPrice = chrysanthemumsCount * 2.00;
                        rosesPrice = rosesCount * 4.10;
                        tulipsPrice = tulipsCount * 2.50;
                        double sum1 = chrysanthemumsPrice + rosesPrice + tulipsPrice ;

                        if (tulipsCount > 7){
                            sum1 = sum1 * 0.95;
                        }else if (rosesCount >= 10){
                            sum1 = sum1 * 0.90;
                        }

                        if (totalFlowers > 20){
                            sum1 = sum1 * 0.80;
                        }
                        double totalSumPriceN = chrysanthemumsPrice + rosesPrice + tulipsPrice;
                        System.out.printf("%.2f",totalSumPriceN);

                        break;
                }
                break;
            case "Autumn":
            case "Winter" :

                break;
        }
    }
}
