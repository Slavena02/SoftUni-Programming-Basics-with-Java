package ForLoop_Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int musala = 0;
        int monblant = 0;
        int kalimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        int sum = 0 ;

        int groups = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= groups; i++) {

            int peopleGroups = Integer.parseInt(scanner.nextLine());

            sum += peopleGroups;

            if (peopleGroups <= 5) {
                musala += peopleGroups;
            } else if (peopleGroups <= 12) {
                monblant += peopleGroups;
            } else if (peopleGroups <= 25) {
                kalimandjaro += peopleGroups;
            } else if (peopleGroups <= 40) {
                k2 += peopleGroups;
            } else {
                everest += peopleGroups;
            }
        }
            double percentMusala = musala * 1.0 / sum * 100;
            System.out.printf("%.2f%%%n", percentMusala);
            double percentMontblanc = monblant * 1.0 / sum * 100;
            System.out.printf("%.2f%%%n", percentMontblanc);
            double percentKil = kalimandjaro * 1.0 / sum * 100;
            System.out.printf("%.2f%%%n", percentKil);
            double percentK2 = k2 * 1.0 / sum * 100;
            System.out.printf("%.2f%%%n", percentK2);
            double percentEverest = everest * 1.0 / sum * 100;
            System.out.printf("%.2f%%%n", percentEverest);

        }

    }
