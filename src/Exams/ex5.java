package Exams;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int child = 0;
        int mature = 0;

        double toys = 5.00;
        double pullover = 15.00;

        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);
            if ( age <= 16){
          child++;
            }else {
                mature++;
            }
            input = scanner.nextLine();
        }
        double childToysPrice = child * toys;
        double maturePulloverPrice = mature * pullover;

        System.out.printf("Number of adults: %d%n" , mature);
        System.out.printf("Number of kids: %d%n" , child);
        System.out.printf("Money for toys: %.0f%n" , childToysPrice);
        System.out.printf("Money for sweaters: %.0f" , maturePulloverPrice);

    }
}
