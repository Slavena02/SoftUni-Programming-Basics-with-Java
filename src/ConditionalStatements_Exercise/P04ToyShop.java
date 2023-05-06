package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        // Прочитаме входните данни
        // Пресмятаме броя на играчките
        // Пресмятаме общата сума за всички играчки
        // Проверяваме дали играчките са 50 или повече -> имаме 25% отстъпка
        // Пресмятаме колко пари са ни останали след като платим наема -> 10% от общата сума
        // Проверка дали парите са достатъчни

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        int countToys = puzzlesCount + dollsCount + teddyBearsCount + minionsCount +truckCount;
        double totalSum = puzzlesCount * 2.60 + dollsCount * 3 + teddyBearsCount * 4.10 + minionsCount * 8.20 + truckCount * 2;

        if (countToys >= 50){
            totalSum = totalSum * 0.75; //totalSum - totalSum * 0.25
        }

        totalSum = totalSum * 0.9;// totalSum - totalSum * 0.1

        if (totalSum >= tripPrice){
            double restMoney = totalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", restMoney);
        } else {
            double neededMoney = tripPrice - totalSum;

            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }



    }
}