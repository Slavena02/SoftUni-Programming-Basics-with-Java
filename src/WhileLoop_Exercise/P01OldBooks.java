import java.util.Scanner;

public class P01OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        int books = 0;
        boolean isFound = false;

        String input = scanner.nextLine();
        while (!book.equals("No More Books")) {
            if (input.equals(book)){
                isFound = true;
                break;
            }
            books++;
            input = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it." , books);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books." , books);
        }
    }
}
