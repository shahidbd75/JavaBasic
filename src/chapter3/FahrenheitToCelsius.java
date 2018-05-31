/*
* Write a program that does the reverse of Exercise 9, that is, input degrees
Fahrenheit and prints out the temperature in degrees Celsius. The formula to
convert degrees Fahrenheit to equivalent degrees Celsius is
Celsius = 5/9 * (Fahrenheit - 32)
*/
package chapter3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double input_Far,output_Cel;
        System.out.println("Please enter temperature in degree celsius");
        Scanner scanner = new Scanner(System.in);

        input_Far = scanner.nextDouble();

        output_Cel =  ((double)5/9) * (input_Far - 32);

        System.out.println("Output temperature in celsius: " + output_Cel);
    }
}
