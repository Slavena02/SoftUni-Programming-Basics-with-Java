package For_Loop_MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int bus = 0;
        int truck = 0;
        int train = 0;
        double price = 0.00;
        double kilograms = 0.00;
        for (int i = 1; i <= count  ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input<= 3){
                bus += count;
                price = bus * 200.00;
            }else if (input <= 11){
                truck += count;
                price = truck * 175.00;
            }else {
                train += count;
                price = train * 120.00;
            }

        }
    }
}
