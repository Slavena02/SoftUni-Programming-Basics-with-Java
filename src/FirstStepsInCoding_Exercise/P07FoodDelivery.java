package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;

        double totalSumPrice = chickenMenuPrice + fishMenuPrice + veganMenuPrice;

        double desert = totalSumPrice * 0.2;

        double totalSumMenu = totalSumPrice + desert + 2.50;

        System.out.println(totalSumMenu);
    }
}
