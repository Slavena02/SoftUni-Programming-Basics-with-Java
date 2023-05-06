package FirstStepsInCoding;

import java.util.Scanner;

public class P07ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameArchitect = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int needHours = project * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameArchitect, needHours, project);

    }
}
