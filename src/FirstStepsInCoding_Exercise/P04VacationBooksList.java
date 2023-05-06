package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int pageTheBooks = Integer.parseInt(scanner.nextLine());
         int pagePerHours = Integer.parseInt(scanner.nextLine());
         int dayReadTheBooks = Integer.parseInt(scanner.nextLine());

         int totalHours = pageTheBooks / pagePerHours;

         int needHoursReadDay = totalHours / dayReadTheBooks;

         System.out.println(needHoursReadDay);
    }
}
