package MoreEx;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradCelsius = Double.parseDouble(scanner.nextLine());
        double gradFahrenheit = 1.8 * gradCelsius + 32;


        System.out.printf("%.2f" , gradFahrenheit);
    }
}
