
package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Record = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeToSwimAMeter = Double.parseDouble(scanner.nextLine());

        double timeWithoutResistance = distanceMeters * timeToSwimAMeter;
        double resistance = Math.floor(distanceMeters / 15) * 12.5;
        double totalTime = resistance + timeWithoutResistance;

        if (totalTime < Record) {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);

        } else {
            double difference = totalTime - Record;

            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}