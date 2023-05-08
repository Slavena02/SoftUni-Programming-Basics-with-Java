package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowersPrice = 0.00;

        switch (flowersType){
            case "Roses":
                flowersPrice = numberFlowers * 5.00;
                if(numberFlowers>80){
                    flowersPrice = flowersPrice - (flowersPrice * 0.10 );
                }
                break;
            case "Dahlias":
                flowersPrice = numberFlowers * 3.80;
                if (numberFlowers > 90){
                    flowersPrice = flowersPrice -(flowersPrice * 0.15);
                }
                break;
            case "Tulips":
                flowersPrice = numberFlowers * 2.80;
                if (numberFlowers > 80){
                    flowersPrice = flowersPrice - ( flowersPrice * 0.15);
                }
                break;
            case "Narcissus":
                flowersPrice = numberFlowers * 3.00;
                if (numberFlowers < 120){
                    flowersPrice = flowersPrice + (flowersPrice * 0.15);
                }
                break;
            case "Gladiolus":
                flowersPrice = numberFlowers * 2.50;
                if (numberFlowers < 80){
                    flowersPrice = flowersPrice + (flowersPrice * 0.20);
                }
                break;
        }

        if (budget >= flowersPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left." , numberFlowers ,flowersType , budget - flowersPrice);

        }else {
            System.out.printf("Not enough money, you need %.2f leva more." , flowersPrice - budget);
        }
    }
}
