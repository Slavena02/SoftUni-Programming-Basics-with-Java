package Exams;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                String fanName = scanner.nextLine();
                double budget = Double.parseDouble(scanner.nextLine());
                int beerQuantity = Integer.parseInt(scanner.nextLine());
                int chipsQuantity = Integer.parseInt(scanner.nextLine());

                double beerPrice = 1.20 * beerQuantity;
                double chipsPrice = beerPrice - (beerPrice * 0.55);
                double totalSumChips = Math.ceil(chipsPrice * chipsQuantity);

                double totalCost = beerPrice + totalSumChips;


                if (budget >= totalCost) {
                    System.out.printf("%s bought a snack and has %.2f leva left.", fanName, budget - totalCost);
                } else {
                    System.out.printf("%s needs %.2f more leva!", fanName, totalCost - budget);
                }
            }
        }

