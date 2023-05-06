package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P02MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentCinema = Integer.parseInt(scanner.nextLine());

        double oneDaySum = tickets * ticketPrice;

        double totalPeriod = day * oneDaySum;

        double percentTheCinema = totalPeriod * percentCinema / 100;

        double totalSum = totalPeriod - percentTheCinema;


        System.out.printf("The profit from the movie %s is %.2f lv." , nameMovie , totalSum);
    }
}
