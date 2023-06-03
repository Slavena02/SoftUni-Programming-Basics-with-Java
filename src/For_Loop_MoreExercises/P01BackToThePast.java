package For_Loop_MoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        int age = 18;

        double sum = 0;

        for (int i = 1800; i <= years; i++) {

            if (i % 2 == 0) {
                sum = budget - 12000;
            } else {
                ++age;
                sum = budget - (12000 + age * 50);
            }
        }

        if (budget > 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left." , sum);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(sum) );
        }
    }
}
