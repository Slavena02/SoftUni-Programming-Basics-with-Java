package Exams;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countCat = Integer.parseInt(scanner.nextLine());

        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int totalGrams = 0;

        for (int i = 1; i <=countCat ; i++) {
            int gramsFood = Integer.parseInt(scanner.nextLine());
             totalGrams += gramsFood;
            if (gramsFood >=100 && gramsFood < 200){
                group1 ++;
            }else if (gramsFood >= 200 && gramsFood < 300){
                group2++;
            }else if (gramsFood >= 300 && gramsFood <= 400){
                group3++;
            }
        }

        double totalKg = totalGrams / 1000.00;
        double totalSumFood = totalKg * 12.45;

        System.out.printf("Group 1: %d cats.%n" , group1);
        System.out.printf("Group 2: %d cats.%n" , group2);
        System.out.printf("Group 3: %d cats.%n" , group3);
        System.out.printf("Price for food per day: %.2f lv." , totalSumFood);
    }
}
