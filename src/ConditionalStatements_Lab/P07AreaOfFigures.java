package ConditionalStatements_Lab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFigure = scanner.nextLine();

        double area = 0;

        if (typeFigure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area  = side * side;

        }else if (typeFigure.equals("rectangle")){
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());

            area =  length * width;

        }else  if (typeFigure.equals("circle")){
            double radios = Double.parseDouble(scanner.nextLine());

            area = Math.PI * radios * radios;
        }
        else if (typeFigure.equals("triangle")){
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
              area = (base*height) / 2;
        }
        System.out.printf("%.3f" , area);
    }
}
