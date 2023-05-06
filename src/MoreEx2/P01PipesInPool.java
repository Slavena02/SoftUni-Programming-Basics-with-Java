package MoreEx2;

import java.util.Scanner;

public class P01PipesInPool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

                //въвеждаме данните както са в условието
                int V = Integer.parseInt(scanner.nextLine());
                int P1 = Integer.parseInt(scanner.nextLine());
                int P2 = Integer.parseInt(scanner.nextLine());
                double H = Double.parseDouble(scanner.nextLine());

                //изчисляваме количеството изпомпана вода
                double firstPipeVolume = P1 * H;
                double secondPipeVolume = P2 * H;
                double totalVolume = firstPipeVolume + secondPipeVolume;

                //проверяваме дали басейнът не е прелял
                if (totalVolume <= V) {
                    //превръщаме информацията в проценти
                    firstPipeVolume = firstPipeVolume / totalVolume * 100;
                    secondPipeVolume = secondPipeVolume / totalVolume * 100;
                    totalVolume = totalVolume / V * 100;

                    //изписваме "The pool is totalVolume% full. "
                    System.out.printf("The pool is %.2f", totalVolume);
                    System.out.print("% full. ");

                    //изписваме "Pipe 1: firstPipeVolume%. "
                    System.out.printf("Pipe 1: %.2f", firstPipeVolume);
                    System.out.print("%. ");

                    //изписваме "Pipe 2: secondPipeVolume%."
                    System.out.printf("Pipe 2: %.2f", secondPipeVolume);
                    System.out.print("%. ");

                } else {
                    //изписваме "For H hours the pool overflows with (totalVolume - V) liters."
                    System.out.printf("For %.2f hours the pool overflows with %.2f liters.",
                            H, totalVolume - V);
                }

            }
        }