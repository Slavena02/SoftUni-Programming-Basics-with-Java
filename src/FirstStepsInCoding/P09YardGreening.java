package FirstStepsInCoding;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardMetres = Double.parseDouble(scanner.nextLine());

        double fullSumMet = yardMetres * 7.61;
        double discountSum = fullSumMet - (fullSumMet * 0.18);
        double totalSum = fullSumMet  - discountSum;

        System.out.printf("The final price is: %.2f lv.%n The discount is:%.2f lv."  , discountSum , totalSum);
    }
}
