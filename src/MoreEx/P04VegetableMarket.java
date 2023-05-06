package MoreEx;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesOneKilograms = Double.parseDouble(scanner.nextLine());
        double fruitsOneKilograms = Double.parseDouble(scanner.nextLine());

        int vegetablePrice = Integer.parseInt(scanner.nextLine());
        int fruitsPrice = Integer.parseInt(scanner.nextLine());

       double sumPriceVeg = vegetablesOneKilograms * vegetablePrice;
       double sumPriceFruit = fruitsOneKilograms * fruitsPrice;

       double totalSumBg = sumPriceVeg + sumPriceFruit;
       double totalSumEvro = totalSumBg / 1.94;


       System.out.printf("%.2f" , totalSumEvro);
    }
}
