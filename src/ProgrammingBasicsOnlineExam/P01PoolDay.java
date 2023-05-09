package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double oneDayPriceSunBed = Double.parseDouble(scanner.nextLine());
        double oneUmbrellaPrice = Double.parseDouble(scanner.nextLine());

        double entranceFeePrice = people * entranceFee;

        double peoplePercent =Math.ceil (people - (people * 0.25));
        double totalSumSunBed = peoplePercent * oneDayPriceSunBed;

        double umbrellaPercent = Math.ceil(people - (people * 0.50));

        double totalSumUmbrella = umbrellaPercent * oneUmbrellaPrice;

        double totalSumPoolDay = entranceFeePrice + totalSumSunBed + totalSumUmbrella;

        System.out.printf("%.2f lv." , totalSumPoolDay);


    }
}
