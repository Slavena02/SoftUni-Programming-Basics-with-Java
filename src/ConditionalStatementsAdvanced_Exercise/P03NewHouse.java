package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowersPrice = 0.00;

        switch (flowersType){
            case "Roses":
                flowersPrice = numFlowers * 5.00;
                if(numFlowers>80){
                    flowersPrice = flowersPrice - (flowersPrice * 0.10 );
                }
                break;
            case "Dahlias":
                flowersPrice = numFlowers * 3.80;
                if (numFlowers > 90){
                    flowersPrice = flowersPrice -(flowersPrice * 0.15);
                }
                break;
            case "Tulips":
                flowersPrice = numFlowers * 2.80;
                if (numFlowers > 80){
                    flowersPrice = flowersPrice - ( flowersPrice * 0.15);
                }
                break;
            case "Narcissus":
                flowersPrice = numFlowers * 3.00;
                if (numFlowers < 120){
                    flowersPrice = flowersPrice + (flowersPrice * 0.15);
                }
                break;
            case "Gladiolus":
                flowersPrice = numFlowers * 2.50;
                if (numFlowers < 80){
                    flowersPrice = flowersPrice + (flowersPrice * 0.20);
                }
                break;
        }

        if (budget >= flowersPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left." , numFlowers ,flowersType , budget - flowersPrice);

        }else {
            System.out.printf("Not enough money, you need %.2f leva more." , flowersPrice - budget);
        }
    }
}
