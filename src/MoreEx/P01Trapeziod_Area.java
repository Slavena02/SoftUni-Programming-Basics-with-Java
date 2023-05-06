package MoreEx;

import java.util.Scanner;

public class P01Trapeziod_Area {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double faceTrap = ( b1+b2)*h /2;

        System.out.printf("%.2f" , faceTrap);


    }
}
