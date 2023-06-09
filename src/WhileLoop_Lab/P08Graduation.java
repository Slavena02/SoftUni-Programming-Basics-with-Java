package WhileLoop_Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int year = 1;
        double sumGrade = 0;
        int poorGradeCount = 0;
        while (year <= 12) {
            if (poorGradeCount > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGradeCount++;
                continue;
            }

            sumGrade = sumGrade + grade;

            year++;
        }

        if (poorGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double avgGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}

