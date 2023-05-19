package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double seconds = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secondOneMetres = Double.parseDouble(scanner.nextLine());


        double secondSum = metres * secondOneMetres;

        double fiftyMetres =Math.floor( metres / 50);
        double metresSum = fiftyMetres * 30;
        double totalSum = secondSum + metresSum;

        if (seconds > totalSum){
            System.out.printf("Yes! The new record is %.2f seconds." , totalSum);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", totalSum - seconds);
        }

    }
}
