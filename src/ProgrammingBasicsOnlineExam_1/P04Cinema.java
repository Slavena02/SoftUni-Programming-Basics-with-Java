package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.00;
        double priceTickets = 5.00;
        int countPeople = 0;
        double sum = 0.00;
        String input = scanner.nextLine();

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            countPeople += people;
            sum = people * priceTickets;
            if (people % 3 == 0) {
                sum = sum - 5.00;
            }
            totalSum += sum;

            if (people > n) {
                System.out.println("The cinema is full.");
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("There are %d seats left in the cinema.", n - countPeople);
        System.out.printf("Cinema income - %.0f lv.", totalSum);
    }
}
