package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int countNight = Integer.parseInt(scanner.nextLine());

        String sport = " ";
        double oneNightPrice = 0.00;

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        oneNightPrice = 9.60;
                        sport = "Judo";
                        break;
                    case "girls":
                        oneNightPrice = 9.60;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        oneNightPrice = 10.00;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        oneNightPrice = 7.20;
                        sport = "Tennis";
                        break;
                    case "girls":
                        oneNightPrice = 7.20;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        oneNightPrice = 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        oneNightPrice = 15.00;
                        sport = "Football";
                        break;
                    case "girls":
                        oneNightPrice = 15.00;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        oneNightPrice = 20.00;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        double totalSum = countNight * oneNightPrice * students;

        if (students >= 50){
            totalSum = totalSum - (totalSum * 0.50);
        }else if (students >= 20){
            totalSum = totalSum - (totalSum * 0.15);
        }else  if (students >= 10){
            totalSum = totalSum - (totalSum * 0.05);
        }

        System.out.printf("%s %.2f lv." , sport ,totalSum);
    }

}