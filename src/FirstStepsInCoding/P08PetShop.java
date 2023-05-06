package FirstStepsInCoding;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        int dogFoodPackage = Integer.parseInt(scanner.nextLine());
        int catFoodPackage = Integer.parseInt(scanner.nextLine());
        double sumFood = (dogFoodPackage * 2.5) + (catFoodPackage * 4);
        System.out.printf("%.1f lv.", sumFood );
    }
}
