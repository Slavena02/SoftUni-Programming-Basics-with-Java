package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int feeOneYears = Integer.parseInt(scanner.nextLine());

        double sneakers = feeOneYears - (feeOneYears * 0.4);
        double outfit = sneakers - (sneakers * 0.2);
        double ball = ( outfit / 4);
        double accessories = (ball /5);

        double totalSum = feeOneYears + sneakers + outfit + ball + accessories;

        System.out.println(totalSum);


    }
}
