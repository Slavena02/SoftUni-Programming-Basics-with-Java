package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int bitcoinCount = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());


        double bitcoinPrice = bitcoinCount * 1168.00;
        double chineseYuanPrice = chineseYuan * 0.264;
        double sum  = bitcoinPrice + chineseYuanPrice ;

        double totalSumEuro = sum / 1.95;

        double totalSum =totalSumEuro -(totalSumEuro * commission/100);

        System.out.printf("%.2f", totalSum);

    }
}
