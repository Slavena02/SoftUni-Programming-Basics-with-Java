package WhileLoop_Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowEstimate  = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int estimate = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int sumEstimate = 0;
        while (!input.equals("Enough")){
            sumEstimate ++;
            sum += estimate;
        }


    }
}
