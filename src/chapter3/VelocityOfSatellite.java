/*
* Level 2, Problem 15
* */
package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VelocityOfSatellite {
    public static void main(String[] args) {
        final double Me = 5.98E24;
        final double G = 6.67E-11;

        double v,r;
        System.out.println("Please enter the distance of satellite from earth:");
        Scanner scanner = new Scanner(System.in);

        r = scanner.nextDouble();

        v = Math.sqrt((G*Me)/r);
        DecimalFormat df=new DecimalFormat("#.##E0");

        System.out.println("Velocity of satellite, v = " + df.format(v));
    }
}
