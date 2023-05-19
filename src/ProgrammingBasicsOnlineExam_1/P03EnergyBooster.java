package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();

        int sets = Integer.parseInt(scanner.nextLine());


        double bigPrice = 0.00;
        double smallPrice = 0.00;
        double setsPrice = 0.00;

        switch (fruit) {
            case "Watermelon":
                switch (size){
                 case "big":
                    bigPrice = 28.70 * 5;
                    setsPrice = sets * bigPrice;
                    if (setsPrice >1000){
                        setsPrice = setsPrice - (setsPrice * 0.50);
                    }else if (setsPrice >400){
                        setsPrice = setsPrice - (setsPrice * 0.15);
                    }
                    break;
                    case "small":
                        smallPrice = 56 * 2;
                        setsPrice = sets * smallPrice;
                        if (setsPrice >1000){
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        }else if (setsPrice >400){
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                }
                break;
            case "Pineapple":
                switch (size) {
                    case "big":
                        bigPrice = 24.80 * 5;
                        setsPrice = sets * bigPrice;
                        if (setsPrice > 1000) {
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        } else if (setsPrice > 400) {
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                        break;
                    case "small":
                        smallPrice = 42.10 * 2;
                        setsPrice = sets * smallPrice;
                        if (setsPrice > 1000) {
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        } else if (setsPrice > 400) {
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                }
                break;
            case "Mango":
                switch (size){
                    case "big":
                        bigPrice = 19.60 * 5;
                        setsPrice = sets * bigPrice;
                        if (setsPrice >1000){
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        }else if (setsPrice >400){
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                        break;
                    case "small":
                        smallPrice = 36.66 * 2;
                        setsPrice = sets * smallPrice;
                        if (setsPrice >1000){
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        }else if (setsPrice >400){
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                }
                break;

            case "Raspberry":
                switch (size){
                    case "big":
                        bigPrice = 15.20 * 5;
                        setsPrice = sets * bigPrice;

                        if (setsPrice >1000){
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        }else if (setsPrice >400){
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                        break;
                    case "small":
                        smallPrice = 20.00 * 2;
                        setsPrice = sets * smallPrice;
                        if (setsPrice >1000){
                            setsPrice = setsPrice - (setsPrice * 0.50);
                        }else if (setsPrice >400){
                            setsPrice = setsPrice - (setsPrice * 0.15);
                        }
                }
                break;


        }
        System.out.printf("%.2f lv." , setsPrice);
    }
}
