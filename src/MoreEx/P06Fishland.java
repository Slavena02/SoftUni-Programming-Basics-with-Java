package MoreEx;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerel = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());

        double oneKilogramsBonito = Double.parseDouble(scanner.nextLine());
        double oneKilogramsSafrid = Double.parseDouble(scanner.nextLine());
        double oneKilogramsMussels = Double.parseDouble(scanner.nextLine());


        double bonitoFish = mackerel + (mackerel * 0.60);
        double bonitoPrice = oneKilogramsBonito * bonitoFish;


        double safridFish = caca + ( caca * 0.80) ;
        double safridPrice = oneKilogramsSafrid * safridFish;

       double musselsPriceOne = 7.50 ;
       double musselsPrice = oneKilogramsMussels * musselsPriceOne;

       double totalSum = bonitoPrice + safridPrice + musselsPrice ;

       System.out.printf("%.2f" , totalSum);



    }
}
