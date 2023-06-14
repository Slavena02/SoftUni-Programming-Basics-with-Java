package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());


         int sumMeters = h * width * 4;
         sumMeters -= sumMeters * 0.10;

         int sumPaint = 0;

        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int liters = Integer.parseInt(input);
               sumPaint += liters;
                sumMeters -= liters;
                if (sumMeters == 0) {
                    break;
                }
                input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            System.out.printf("%d quadratic m left.", sumMeters);
        }
        if (sumPaint > sumMeters){
            System.out.printf("All walls are painted and you have %d l paint left!" , sumPaint - sumMeters);
        }else if (sumPaint == sumMeters){
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
