package chapter4;

import java.util.Scanner;

public class WeightMesurement {
    public static void main(String[] args) {
        final double MERCURY_VALUE = 0.4;
        final double VENUS_VALUE = 0.9;
        final double JUPITER_VALUE = 2.5;
        final double SATURN_VALUE = 1.1;
        double weight;

        System.out.println("Please enter weight in earth");

        Scanner s = new Scanner(System.in);

        weight = s.nextDouble();

        WeightConverter mercuryWeight;
        mercuryWeight = new WeightConverter(MERCURY_VALUE);
        WeightConverter venusWeight;
        venusWeight = new WeightConverter(VENUS_VALUE);
        WeightConverter jupiterWeight;
        jupiterWeight = new WeightConverter(JUPITER_VALUE);
        WeightConverter saturnWeight;
        saturnWeight = new WeightConverter(SATURN_VALUE);


        System.out.println("Weight in mercury: " + mercuryWeight.convert(weight));
        System.out.println("Weight in Venus: " + venusWeight.convert(weight));
        System.out.println("Weight in Jupiter: " + jupiterWeight.convert(weight));
        System.out.println("Weight in Saturn: " + saturnWeight.convert(weight));
    }
}
