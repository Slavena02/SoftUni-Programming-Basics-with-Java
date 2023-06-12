package WhileLoopMoreExercises;

import java.util.Scanner;

public class P04NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 99; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }
    }
}
