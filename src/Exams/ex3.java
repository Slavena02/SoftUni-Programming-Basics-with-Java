package Exams;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cake = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int dayOfMonth = Integer.parseInt(scanner.nextLine());

        double priceProduct = 0.00;

        switch (cake) {
            case "Cake":
                if (dayOfMonth <= 15){
                    priceProduct = count * 24.00;
                }else {
                    priceProduct = count * 28.70;
                }
                break;
            case "Souffle":
                if (dayOfMonth <= 15){
                    priceProduct = count * 6.66;
                }else {
                    priceProduct = count * 9.80;
                }
                break;
            case "Baklava":
                if (dayOfMonth <= 15){
                    priceProduct = count * 12.60;
                }else {
                    priceProduct = count * 16.98;
                }
                break;
        }
        if (dayOfMonth <= 22){
            if (priceProduct >= 100 && priceProduct < 200){
                priceProduct -= priceProduct * 0.15;
            }else if (priceProduct >= 200) {
                priceProduct -= priceProduct * 0.25;
            }
        }
        if ( dayOfMonth <= 15){
            priceProduct -= priceProduct * 0.10;
        }

        System.out.printf("%.2f" , priceProduct);
    }
}
