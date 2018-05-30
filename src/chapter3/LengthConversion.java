/**
 * Level 1 - Problem 7:
 * Write a program to convert centimeters (input) to feet and inches (output).
 *         1 in = 2.54 cm.
 */
package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LengthConversion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double inputCM,outputInch;
        String result;
        System.out.println("Please enter value in centimeter: ");
        DecimalFormat dFormat = new DecimalFormat("0.00");
        inputCM = scanner.nextDouble();

        outputInch = inputCM /2.54;
        String remainder = dFormat.format((outputInch % 12));

        int outputFeet = (int) outputInch/12;
        result = outputFeet +" Feet," + remainder + " inch";
        System.out.println("Output is: " + result);
    }
}
