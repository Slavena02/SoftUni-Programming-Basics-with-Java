package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int firstPlayer = Integer.parseInt(scanner.nextLine());
        int doublePlayer = Integer.parseInt(scanner.nextLine());
        int treePlayer = Integer.parseInt(scanner.nextLine());

        int totalTime = firstPlayer + doublePlayer + treePlayer;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }else {
            System.out.printf("%d:%d", minutes,seconds);

        }


    }
}