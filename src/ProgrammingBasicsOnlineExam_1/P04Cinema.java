package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalIncome = 0;
        int seatsTaken = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);

            if (seatsTaken + people > capacity) {
                break;
            }

            seatsTaken += people;
            int income = people * 5;

            if (people % 3 == 0) {
                income -= 5;
            }

            totalIncome += income;

            input = scanner.nextLine();
        }

        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", capacity - seatsTaken);
        } else {
            System.out.println("The cinema is full.");
        }

        System.out.printf("Cinema income - %d lv.", totalIncome);
    }
}