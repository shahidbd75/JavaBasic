package chapter3;

import java.util.Scanner;

public class WeightMesurement {
    public static void main(String[] args) {
        final double MERCURY_VALUE = 0.4;
        final double VENUS_VALUE = 0.9;
        final double JUPITER_VALUE = 2.5;
        final double SATURN_VALUE = 1.1;
        double weight;

        System.out.println("Please enter weight in earth");

        Scanner s =new Scanner(System.in);

        weight = s.nextDouble();

        System.out.println("Weight in Mercury: " + weight * MERCURY_VALUE);
        System.out.println("Weight in Venus: " + weight * VENUS_VALUE);
        System.out.println("Weight in Jupiter: " + weight * JUPITER_VALUE);
        System.out.println("Weight in Saturn: " + weight * SATURN_VALUE);
    }
}
