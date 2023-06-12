package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budgetActor = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("ACTION")){
            int length = input.length();
            if (length > 15){
                budgetActor -= budgetActor * 0.20;
                input = scanner.nextLine();
                continue;
            }

            double many = Double.parseDouble(scanner.nextLine());
            budgetActor -= many;

         input = scanner.nextLine();


         if (budgetActor >= many){
             System.out.printf("We are left with %.2f leva.", budgetActor - many);
         }else {
             System.out.printf("We need %.2f leva for our actors." , many - budgetActor);
         }
        }


    }
}
