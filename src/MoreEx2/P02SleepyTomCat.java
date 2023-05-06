package MoreEx2;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfYear = Integer.parseInt(scanner.nextLine());

        int normalPlayTime = 30000;

        int workDay = 365 - dayOfYear;

        int playTime = workDay * 63 + dayOfYear * 127;

        int normalSleep = Math.abs(normalPlayTime - playTime);

        int hours = normalSleep / 60;
        int minutes = normalSleep % 60;

        if (playTime > normalPlayTime) {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play" , hours ,minutes);
        } else if (playTime < normalPlayTime) {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play" , hours , minutes);

        }


    }
}


