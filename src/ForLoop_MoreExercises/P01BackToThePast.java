package ForLoop_MoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;

        for (int i = 18; i < 0; i++) {

        }
        for (int i = 1800; i >= years; i++) {
            if (i  % 2 == 0){
                sum = 12.000 * i ;
            }else{
                sum = 12.000 * 50 * 10;
            }

        }

    }
}
