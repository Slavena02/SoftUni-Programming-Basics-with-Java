package For_Loop_MoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        double fansA = 0;
        double fansB = 0;
        double fansV = 0;
        double fansG = 0;
        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector){
                case "A":
                    fansA++;
                    break;
                case "B":
                    fansB++;
                    break;
                case "V":
                    fansV++;
                    break;
                case "G":
                    fansG++;
                    break;
            }
            double fansAPercent = fansA / fans  * 100;
            double fansBPercent = fansB / fans  * 100;
            double fansVPercent = fansV / fans  * 100;
            double fansGPercent = fansG / fans  * 100;
            double sectorPercent = fans * 1.0 / stadium * 100;

            System.out.printf("%.2f%%%n",fansAPercent);
            System.out.printf("%.2f%%%n",fansBPercent);
            System.out.printf("%.2f%%%n",fansVPercent);
            System.out.printf("%.2f%%%n",fansGPercent);
            System.out.printf("%.2f%%%n" ,sectorPercent);
        }
    }
}

