package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        double price = 0.00;
        double sumPrice = 0.00;

        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            int count = Integer.parseInt(scanner.nextLine());
            int length = input.length();

            sumPrice = length * count;
            if (sumPrice % 2 == 1) {
                sumPrice -= sumPrice * 0.25;
            }
            price += sumPrice;
            if (sumPrice >= sum) {
                break;
            }
            input = scanner.nextLine();
        }
        if ( sumPrice >= sum) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", price);
        }else {
            System.out.printf(" We need %.2f leva more.%n" , sum - price);
            System.out.printf("Club income - %.2f leva.", price);
        }

    }
}
