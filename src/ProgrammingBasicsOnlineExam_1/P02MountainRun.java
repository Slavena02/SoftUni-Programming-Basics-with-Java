package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double seconds = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secondOneMetres = Double.parseDouble(scanner.nextLine());


        double secondSum = metres * secondOneMetres;

        double fiftyMetres =Math.floor( metres / 50);
        double metresSum = fiftyMetres * 30;
        double totalSum = secondSum + metresSum;

        if (seconds > totalSum){
            System.out.printf("Yes! The new record is %.2f seconds." , totalSum);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", totalSum - seconds);
        }

    }

    public static class P03CoffeeMachine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            String condition = scanner.nextLine();
            int n = Integer.parseInt(scanner.nextLine());

            double price = 0.00;
            int espressoSum = 0;
            switch (name) {
                case "Espresso":
                    espressoSum = n;
                    switch (condition) {
                        case "Without":
                            price = 0.90 * n;
                            price = price - (price * 0.35);
                            break;
                        case "Normal":
                            price = 1.00 * n;
                            break;
                        case "Extra":
                            price = 1.20 * n;
                            break;
                    }
                    break;
                case "Cappuccino":
                    switch (condition) {
                        case "Without":
                            price = 1.00 * n;
                            price = price - (price * 0.35);
                            break;
                        case "Normal":
                            price = 1.20 * n;
                            break;
                        case "Extra":
                            price = 1.60 * n;
                            break;
                    }
                    break;
                case "Tea":
                    switch (condition) {
                        case "Without":
                            price = 0.50 * n;
                            price = price - (price * 0.35);
                            break;
                        case "Normal":
                            price = 0.60 * n;
                            break;
                        case "Extra":
                            price = 0.70 * n;
                            break;
                    }
            }

                    if (espressoSum >= 5) {
                        price = price * 0.75;
                    }

                    if (price > 15.00) {
                        price = price * 0.80;
                    }

                    System.out.printf("You bought %d cups of %s for %.2f lv.", n, name, price);
            }
        }
}
