package For_Loop_MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int bus = 0;
        int truck = 0;
        int train = 0;

        double t = 0.00;

        for (int i = 1; i <= count; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input <= 3) {
                t += input;
                bus += input;
            } else if (input <= 11) {
                t += input;
                truck += input;
            } else {
                t += input;
                train += input;
            }

        }
            double arithmeticMean = (bus * 200.00 + truck * 175.00 + train * 120.00) / t;

            double busPercent = bus / t * 100;
            double truckPercent = truck / t * 100;
            double trainPercent = train / t * 100;

            System.out.printf("%.2f%n" , arithmeticMean);
            System.out.printf("%.2f%%%n", busPercent);
            System.out.printf("%.2f%%%n",truckPercent);
            System.out.printf("%.2f%%%n",trainPercent);
        }
    }

