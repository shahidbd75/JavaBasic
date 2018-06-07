package chapter4;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Please enter temperature in in celsius: ");
        Scanner scanner =new Scanner(System.in);

        Double tempInCel;
        tempInCel =scanner.nextDouble();

        Temperature temperature = new Temperature();

        temperature.setFahrenheit(tempInCel);

        System.out.println("Temperature in Fahrenheit: " + temperature.toFahrenheit());
    }
}
