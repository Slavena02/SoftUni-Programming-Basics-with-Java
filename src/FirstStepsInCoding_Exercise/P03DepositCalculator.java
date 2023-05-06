package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

       double sumDeposit = Double.parseDouble(scanner.nextLine());
       int termOfDeposit = Integer.parseInt(scanner.nextLine());
       double annualInterestRate = Double.parseDouble(scanner.nextLine());

       double interestPerMonth = (sumDeposit * annualInterestRate / 100) / 12;
       double totalSumDeposit = sumDeposit + interestPerMonth * termOfDeposit;
       System.out.println(totalSumDeposit);
    }
}
