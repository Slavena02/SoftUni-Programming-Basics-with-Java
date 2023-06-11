package WhileLoopMoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int newPreparation = 750;
        int preparationMl = 0;
        int plates = 0;
        int countPlates = 0;
        int pots = 0;
        int countPots = 0;
        int period = 0;
        while (!input.equals("End")) {
            int sumPreparation = Integer.parseInt(input);
            newPreparation = sumPreparation * newPreparation;
            int utensils = Integer.parseInt(scanner.nextLine());
            period++;
            if (period % 3 == 0) {
                pots = utensils * 15;
                preparationMl += pots;
                countPots += utensils;
            } else {
                plates = utensils * 5;
                preparationMl += plates;
                countPlates += utensils;
            }

            if (preparationMl > newPreparation) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", preparationMl - newPreparation);
            }
        }
        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.", countPlates, countPots);
        System.out.printf("Leftover detergent %d ml.", newPreparation - preparationMl);
    }
}
