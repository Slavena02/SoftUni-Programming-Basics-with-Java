package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int HoursOfArrival = Integer.parseInt(scanner.nextLine());
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());


        int totalExamMinutes = examHours * 60 + examMinutes;
        int totalArrivalMinutes = HoursOfArrival * 60 + minutesOfArrival;

        int diff = Math.abs(totalExamMinutes - totalArrivalMinutes);

        if (totalArrivalMinutes > totalExamMinutes){
            System.out.println("Late");
            if (diff < 60){
                System.out.printf("%.2d minutes after the star",diff);
            }else{
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the star", hour,minutes);
            }
        }else if ( diff <= 30){
            System.out.println("On time");
            
        }

    }
}
