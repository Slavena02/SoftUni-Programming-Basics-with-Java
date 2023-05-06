package MoreEx;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                double lengthInMeters = Double.parseDouble(scanner.nextLine());
                double weightInMeters = Double.parseDouble(scanner.nextLine());


                double lengthInCentimeters = (lengthInMeters * 100);
                double weightInCentimetres = (weightInMeters * 100);

                double weight = weightInCentimetres - 100;

                double seatsInWeight = Math.floor(weight / 70);
                double rowsInLength = Math.floor(lengthInCentimeters / 120);

                double allSeats = (seatsInWeight * rowsInLength) - 3;


                System.out.printf("%.0f", allSeats);

            }
        }
