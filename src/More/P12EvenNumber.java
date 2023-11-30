package More;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEvenNumber = false;

        while (!isEvenNumber) {

          int number = Math.abs(Integer.parseInt(scanner.nextLine()));

            if (number % 2 == 0) {
                isEvenNumber = true;
                System.out.printf("The number is: %d", number);
            } else {
                System.out.println("Please write an even number.");
            }

        }
    }
}

