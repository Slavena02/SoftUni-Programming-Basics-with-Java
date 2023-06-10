package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersOneMonth = Double.parseDouble(scanner.nextLine());

        double sumOneKilometers = 0.00;
        double totalSum = 0.00;
        switch (season){
            case "Autumn":
            case "Spring":
                    if (kilometersOneMonth <= 5000){
                        sumOneKilometers = 0.75;
                    }else if (kilometersOneMonth <= 10000){
                        sumOneKilometers = 0.95;
                    }else if (kilometersOneMonth <= 20000){
                        sumOneKilometers = 1.45;
                    }
                break;
            case "Summer":
                if (kilometersOneMonth <= 5000){
                    sumOneKilometers = 0.90;
                }else if (kilometersOneMonth <= 10000){
                    sumOneKilometers = 1.10;
                }else if (kilometersOneMonth <= 20000){
                    sumOneKilometers = 1.45;
                }
                break;
            case "Winter":
                if (kilometersOneMonth <= 5000){
                    sumOneKilometers = 1.05;
                }else if (kilometersOneMonth <= 10000){
                    sumOneKilometers = 1.25;
                }else if (kilometersOneMonth <= 20000){
                    sumOneKilometers = 1.45;
                }
                break;
        }
    }
}
