package ForLoop_Exercise;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n ; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1++;
            } else if (num < 400) {
                p2++;
            } else if (num < 600) {
                p3++;
            } else if (num < 800) {
                p4++;
            } else {
                p5++;
            }
        }

            double p1Percent = (p1 * 1.0 / n) * 100;
            double p2Percent = (p2 * 1.0 / n) * 100;
            double p3Percent = (p3 * 1.0 / n) * 100;
            double p4Percent = (p4 * 1.0 / n) * 100;
            double p5Percent = (p5 * 1.0 / n) * 100;


            System.out.printf("%.2f%%%n" ,p1Percent);
            System.out.printf("%.2f%%%n" ,p2Percent);
            System.out.printf("%.2f%%%n" ,p3Percent);
            System.out.printf("%.2f%%%n" ,p4Percent);
            System.out.printf("%.2f%%%n" ,p5Percent);

    }
}
