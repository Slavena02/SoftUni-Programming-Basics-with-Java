package ForLoop_Exercise;

import java.util.Scanner;

public class P08TennisRankList {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int wens = 0;

        int pointW = 2000;
        int pointF = 1200;
        int pointSF = 720;
        int sum = startPoints;

        for (int i = 1; i <= tournaments ; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    sum += pointW;
                    wens++;
                    break;
                case "F":
                    sum += pointF;
                    break;
                case "SF":
                    sum += pointSF;
                    break;
            }
        }



        int totalSum = sum - startPoints;

            double arithmeticMean = Math.floor(totalSum * 1.0 / tournaments);
            double percentWens = (wens * 1.0 / tournaments) * 100;

        System.out.printf("Final points: %d%n" ,sum);
        System.out.printf("Average points: %.0f%n",arithmeticMean );
        System.out.printf("%.2f%%%n" ,percentWens);

    }
}
