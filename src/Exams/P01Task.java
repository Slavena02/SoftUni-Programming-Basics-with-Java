package Exams;

import java.util.Scanner;

public class P01Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();
        int season = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodesFreeAdvertisement = Integer.parseInt(scanner.nextLine());

        int  extraTime = 10;
        double advertisementTime = episodesFreeAdvertisement * 0.2;

        double oneEpisode = episodesFreeAdvertisement + advertisementTime;

        double extraTimeTotal = extraTime * season;

        double totalSumTime = Math.floor(oneEpisode * episodes * season + extraTimeTotal);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes." , nameMovie, totalSumTime);

    }
}
