package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r  = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double  income = 0.00;
        if (projection.equals("Premiere")){
            income = r * c * 12;
        }else if (projection.equals("Normal")){
            income = r * c * 7.50;
        }else if (projection.equals("Discount")){
            income = r *c * 5.00;
        }

        System.out.printf ("%.2f leva" , income);
    }
}
