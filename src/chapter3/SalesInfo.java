/*
* Chapter 3, Level 3, problem 24 */
package chapter3;

import java.util.Scanner;

public class SalesInfo {
    public static void main(String[] args) {
        double totalPrice,totalPriceWithTax,unitWeight,numberOfUnits;
        final double COST_PER_POUND = 5.99;
        final double SALES_TAX = 0.0725;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter unit weight of bag");
        unitWeight = scanner.nextDouble();
        System.out.println("Please enter the number of bags");
        numberOfUnits = scanner.nextDouble();

        totalPrice = unitWeight * numberOfUnits * COST_PER_POUND;
        totalPriceWithTax = totalPrice + totalPrice * SALES_TAX;

        System.out.println("Number of bags sold:" + numberOfUnits);
        System.out.println("Weight per bag:" + unitWeight + " lb");
        System.out.println("Price per pound:" + COST_PER_POUND);
        System.out.println("Sales tax:" + SALES_TAX);
        System.out.println("Total price:" + totalPriceWithTax);
    }
}
