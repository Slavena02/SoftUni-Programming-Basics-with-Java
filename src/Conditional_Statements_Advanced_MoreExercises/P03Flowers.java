package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        double chrysanthemumsPrice = chrysanthemumsCount * 2.00;
        double rosesPrice = rosesCount * 4.10;
        double tulipsPrice  = tulipsCount * 2.50;

        int flowers = chrysanthemumsCount + rosesCount + tulipsCount;
        double sum = chrysanthemumsPrice + rosesPrice + tulipsPrice;


           switch (season){
               case "Spring":
                   switch (day){
                       case "Y":
                           chrysanthemumsPrice = chrysanthemumsPrice + (chrysanthemumsPrice * 0.15);
                           rosesPrice = rosesPrice + (rosesPrice * 0.15);
                           tulipsPrice = tulipsPrice + (tulipsPrice * 0.15);

                           if (tulipsCount  > 7){
                               sum = sum - (sum * 0.05);

                           }else if (flowers > 20){
                               sum = sum - (sum * 0.20);
                           }
                           break;
                       case "N":

                            chrysanthemumsPrice = chrysanthemumsCount * 2.00;
                           rosesPrice = rosesCount * 4.10;
                           tulipsPrice  = tulipsCount * 2.50;

                           if (flowers > 20){
                               sum = sum - (sum * 0.20);
                           }
                           break;
                   }
                   break;
               case "Summer" :
                   break;
               case "Autumn":
                   break;
               case "":
                   break;

}








    }
}

