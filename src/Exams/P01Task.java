package Exams;

import java.util.Scanner;

public class P01Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int season = Integer.parseInt(scanner.nextLine());
        int episode = Integer.parseInt(scanner.nextLine());
        double teamEpisode = Double.parseDouble(scanner.nextLine());

        double advertisementEpisode = episode + (episode * 0.20);
        double sumEpisode = episode + advertisementEpisode;
        double specialEpisode = season * 10;
        double totalSumMinutes = sumEpisode * episode * season + 30;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, totalSumMinutes);


    }
}
