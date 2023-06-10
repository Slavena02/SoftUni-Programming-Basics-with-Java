package Conditional_Statements_Advanced_MoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double alaska  = 0.00;
        double morocco = 0.00;

        if (budget < 1000){
            switch (season){
                case "Summer":
                    alaska = budget * 0.65;
                    System.out.printf("Alaska - Camp - %.2f" , alaska);
                    break;
                case "Winter":
                    morocco = budget * 0.45;
                    System.out.printf("Morocco - Camp - %.2f" , morocco);
                    break;
            }
        }else if (budget < 3000){
            switch (season){
                case "Summer":
                    alaska = budget * 0.80;
                    System.out.printf("Alaska - Hut - %.2f" , alaska);
                    break;
                case "Winter":
                    morocco = budget * 0.60;
                    System.out.printf("Morocco - Hut - %.2f" , morocco);
                    break;
            }
        }else {
            switch (season){
                case "Summer":
                    alaska = budget * 0.90;
                    System.out.printf("Alaska - Hotel - %.2f" , alaska);
                    break;
                case "Winter":
                    morocco = budget * 0.90;
                    System.out.printf("Morocco - Hotel - %.2f" , morocco);
                    break;
            }

        }
    }
}
