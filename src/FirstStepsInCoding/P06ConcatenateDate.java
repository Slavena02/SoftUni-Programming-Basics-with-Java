package FirstStepsInCoding;

import java.util.Scanner;

public class P06ConcatenateDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String fName = scanner.nextLine();
        String lName = scanner.nextLine();
        int age  = Integer.parseInt(scanner.nextLine());
        String town  = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s." , fName , lName , age , town);
    }
}
