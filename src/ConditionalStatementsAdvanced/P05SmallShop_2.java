package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05SmallShop_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double oneProduct = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if(town.equals("Sofia")){
            switch (product){
                case "coffee":
                    price = 0.50;
                    break;
                case "water":
                    price = 0.80;
                    break;
                case "beer":
                    price = 1.20;
                    break;
                case "sweets":
                    price = 1.45;
                    break;
                case "peanuts":
                    price = 1.60;
                    break;

            }

        }
        if (town.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    price = 0.40;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "beer":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.30;
                    break;
                case "peanuts":
                    price = 1.50;
                    break;

            }

        }
        if (town.equals("Varna")){
            switch (product){
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "beer":
                    price = 1.10;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "peanuts":
                    price = 1.55;
                    break;

            }

        }
        double totalSum = price * oneProduct;
        System.out.println(totalSum);


    }
}
