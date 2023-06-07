package WhileLoop_Exercise;

import java.util.Scanner;

public class P01OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        int books = 0;
        while (!book.equals("No More Books")){

            System.out.println("The book you search is not here!");
            System.out.printf("You checked {брой} books.");
            book = scanner.nextLine();

        }
    }
}
