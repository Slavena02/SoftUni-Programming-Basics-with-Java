package WhileLoopMoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double preparationMl = 0;
        int plates = 0;
        int countPlates = 0;
        int pots = 0;
        int countPots = 0;
        int period = 0;


        while (!input.equals("End") ) {
            int utensils = Integer.parseInt(input);
             period++;
            if(period % 3 == 0){
                pots = utensils * 15;
                preparationMl += pots;
                countPots += utensils;
            }else{
                plates = utensils * 5;
                preparationMl += plates;
                countPlates += utensils;
            }

            if (preparationMl <= 750){
                System.out.println("Detergent was enough!");
                System.out.printf("%d dishes and {брой чисти тенджери} pots were washed.");
                System.out.printf("Leftover detergent {количество останал препарат} ml.");
            }




        }
    }
}
