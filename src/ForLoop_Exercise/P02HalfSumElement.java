package ForLoop_Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxElement = Integer.MIN_VALUE;
        int sum = 0 ;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > maxElement){
                maxElement = num;
            }
        }
        int sumWithOutNumber = sum - maxElement;

        if (maxElement == sumWithOutNumber){
            System.out.println("Yes");
            System.out.println("Sum = " + maxElement);
        }else {
            int diff = Math.abs(maxElement - sumWithOutNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}
