package For_Loop_MoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());

        double sumElectricityBill = 0.00;
        double totalSumOther = 0.00;
        double waterBill = 20.00 ;
        double internetBill = 15.00;
        double otherBill = 0.00;

        for (int i = 1; i <=month ; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            sumElectricityBill += electricityBill ;

            otherBill = (electricityBill + waterBill + internetBill) ;
            otherBill = otherBill + (otherBill * 0.20);
            totalSumOther += otherBill;

        }

        double average = (sumElectricityBill + waterBill * month + internetBill*month + totalSumOther) / month;

        System.out.printf("Electricity: %.2f lv%n" ,sumElectricityBill);
        System.out.printf("Water: %.2f lv%n" , waterBill * month);
        System.out.printf("Internet: %.2f lv%n" ,internetBill * month);
        System.out.printf("Other: %.2f lv%n" , totalSumOther);
        System.out.printf("Average: %.2f lv%n" , average);
    }
    }

