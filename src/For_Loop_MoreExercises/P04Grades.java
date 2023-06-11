package For_Loop_MoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        double sumOfEstimates = 0.00;

        for (int i = 1; i <= countStudent ; i++) {
            double resultExam = Double.parseDouble(scanner.nextLine());
            if (resultExam <= 2.99){
                sumOfEstimates += resultExam;
                count1++;
            }else if (resultExam <= 3.99){
                sumOfEstimates += resultExam;
               count2++;
            }else if (resultExam <= 4.99){
                sumOfEstimates += resultExam;
               count3++;
            }else {
                sumOfEstimates += resultExam;
                count4++;
            }

        }
        double arithmeticMean = sumOfEstimates / countStudent;


        double topStudents = count4 /sumOfEstimates * 100;
        double between4 = count3 /sumOfEstimates * 100;
        double between3 = count2 /sumOfEstimates * 100;
        double fail = count1 /sumOfEstimates * 100;

        System.out.printf("Top students: %.2f%%%n" , topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",between3);
        System.out.printf("Fail: %.2f%%%n" , fail);
        System.out.printf("Average: %.2f%%%n",arithmeticMean);
    }
}
