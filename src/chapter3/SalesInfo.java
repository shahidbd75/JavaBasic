/*
* Chapter 3, Level 3, problem 24 */
package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesInfo {
    public static void main(String[] args) {
        int unitWeight,numberOfUnits;
        double totalPrice,totalPriceWithTax;
        final double COST_PER_POUND = 5.99;
        final double SALES_TAX = 7.25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit weight of bag");
        unitWeight = scanner.nextInt();
        System.out.println("Please enter the number of bags");
        numberOfUnits = scanner.nextInt();

        totalPrice = unitWeight * numberOfUnits * COST_PER_POUND;
        totalPriceWithTax = totalPrice + totalPrice * (SALES_TAX/100);

        System.out.println("Number of bags sold:\t" + numberOfUnits);
        System.out.println("Weight per bag:\t" + unitWeight + " lb");
        System.out.println("Price per pound:\t $" + COST_PER_POUND);
        System.out.println("Sales tax:\t" + SALES_TAX + "%");
        System.out.println("Total price:\t $" + totalPriceWithTax);
    }
}
