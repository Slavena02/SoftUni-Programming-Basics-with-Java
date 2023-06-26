package Exams;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double pagePrintingPrice = Double.parseDouble(scanner.nextLine());
                double coverPrintingPrice = Double.parseDouble(scanner.nextLine());
                int paperDiscount = Integer.parseInt(scanner.nextLine());
                double designerFee = Double.parseDouble(scanner.nextLine());
                int teamPaymentPercentage = Integer.parseInt(scanner.nextLine());

                int totalPages = 899;
                int totalCovers = 2;

                double pagesCost = pagePrintingPrice * totalPages;
                double coversCost = coverPrintingPrice * totalCovers;

                double paperDiscountPercentage = (100 - paperDiscount) / 100.0;
                double totalPrintingCost = (pagesCost + coversCost) * paperDiscountPercentage;

                double designerPayment = totalPrintingCost + designerFee;
                double teamPaymentPercentageDecimal = teamPaymentPercentage / 100.0;
                double avtonomPayment = designerPayment * (1 - teamPaymentPercentageDecimal);

                System.out.printf("Avtonom should pay %.2f BGN.", avtonomPayment);
            }
        }
