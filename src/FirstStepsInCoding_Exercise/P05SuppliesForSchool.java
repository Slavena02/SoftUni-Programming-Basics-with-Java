package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int packagesPen = Integer.parseInt(scanner.nextLine());
        int packagesMarker = Integer.parseInt(scanner.nextLine());
        int preparationLitres = Integer.parseInt(scanner.nextLine());

        double reduction = Double.parseDouble(scanner.nextLine());

        double penPrice = packagesPen * 5.80;
        double markerPrice = packagesMarker * 7.20;
        double preparationPrice = preparationLitres * 1.20;

        double totalSum = penPrice + markerPrice + preparationPrice;

        double totalSumPrice = totalSum - (totalSum * ( reduction / 100));


        System.out.println(totalSumPrice);




    }
}
