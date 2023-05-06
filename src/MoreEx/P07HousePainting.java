package MoreEx;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenArea = ((x*x) + (x*y)) * 2;
        double doorAndWindows = 2 * (1.50*1.50) + 2 * 1.20;

        double greenAllArea = greenArea - doorAndWindows ;

        double litersGreen = greenAllArea / 3.4;

        double redArea = 2 * (x*y) + 2 * ((x*h) / 2 );
        double litersRed = redArea /4.3;


        System.out.printf("%.2f %n%.2f" , litersGreen , litersRed);





    }
}
