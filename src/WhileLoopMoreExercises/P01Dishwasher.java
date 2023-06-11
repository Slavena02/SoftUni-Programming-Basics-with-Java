package WhileLoopMoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottlesCount = Integer.parseInt(scanner.nextLine());

        int platesCount = 0;
        int potsCount = 0;
        int detergentNeeded = 0;
        int newPreparation = bottlesCount * 750;
        int period = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int itemsCount = Integer.parseInt(input);
            period++;
            if (period % 3 == 0) {
                potsCount += itemsCount;
                detergentNeeded += itemsCount * 15;

            } else {
                platesCount += itemsCount;
                detergentNeeded += itemsCount * 5;

            }

            if (detergentNeeded > newPreparation) {
                System.out.printf("Not enough detergent, %d ml. more necessary!%n", detergentNeeded - bottlesCount * 750);
                return;
            }

            input = scanner.nextLine();
        }

        int leftoverDetergent = newPreparation - detergentNeeded;
        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n", platesCount, potsCount);
        System.out.printf("Leftover detergent %d ml.", leftoverDetergent);
    }
}