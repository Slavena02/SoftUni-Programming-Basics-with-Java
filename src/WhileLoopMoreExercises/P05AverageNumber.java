package WhileLoopMoreExercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;
        double sum = 0;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            num++;
            sum += number;
        }
        double average = sum / num;
        System.out.printf("%.2f" , average);
    }
}
