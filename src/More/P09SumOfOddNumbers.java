package More;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int num = 1; num <= 100; num +=3){
            System.out.println(num);
            sum += num;
        }
        System.out.println(sum);
    }
}
