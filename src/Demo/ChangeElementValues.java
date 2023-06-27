package Demo;

import java.util.Scanner;

public class ChangeElementValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [][] myNumbers = {{1,2,3,4,5,},{6,7,8,9,10}};
        myNumbers[1][1] = 3;
        System.out.println(myNumbers[1][1]);
    }
}
