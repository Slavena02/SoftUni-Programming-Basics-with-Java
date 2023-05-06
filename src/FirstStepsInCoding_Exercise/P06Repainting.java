package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonNeed = Integer.parseInt(scanner.nextLine());
        int paintNeed = Integer.parseInt(scanner.nextLine());
        int solventNeed = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonNeedPrice = (nylonNeed + 2) * 1.50 ;
        double paintNeedPrice =(paintNeed +  (paintNeed * 0.1)) * 14.50 ;
        double solventNeedPrice = solventNeed * 5.00;
        double bags = 0.40;

        double totalSumMaterials = nylonNeedPrice + paintNeedPrice + solventNeedPrice + bags;

        double workPrice = (totalSumMaterials * 0.3) * hours;

        double totalSum = totalSumMaterials + workPrice;

        System.out.println(totalSum);



    }
}
