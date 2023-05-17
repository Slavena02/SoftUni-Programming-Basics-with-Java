package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int walkingMinutesDay = Integer.parseInt(scanner.nextLine());
        int walking = Integer.parseInt(scanner.nextLine());
        int caloriesOneDay = Integer.parseInt(scanner.nextLine());


        double minutesTotal = walking * walkingMinutesDay;
        double caloriesDay = minutesTotal * 5;

        double totalCaloriesOneDay =Math.abs(caloriesOneDay - (caloriesOneDay * 0.50));

        if (caloriesDay > totalCaloriesOneDay){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f." , caloriesDay);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f." ,caloriesDay);
        }
    }
}
