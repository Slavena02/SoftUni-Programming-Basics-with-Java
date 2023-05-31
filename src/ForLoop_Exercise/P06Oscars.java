package ForLoop_Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();;
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double sumPoints = pointsAcademy;

        for (int i = 1; i <=jury ; i++) {
            String name = scanner.nextLine();
            double secondsPoints = Double.parseDouble(scanner.nextLine());
            sumPoints += (name.length() * secondsPoints) / 2;

            if (sumPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, sumPoints);
                break;
            }
        }
         if (sumPoints < 1250.5){
             double diff = Math.abs(sumPoints - 1250.5);
             System.out.printf("Sorry, %s you need %.1f more!", nameActor, diff);
            
        }
    }
}
