package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double cake = budget  * 0.20;
        double drinks = cake - (cake * 0.45);
        double anime =  budget / 3;

        double totalSum = budget + cake + drinks + anime;

        System.out.printf("%.2f" , totalSum);



    }

}
