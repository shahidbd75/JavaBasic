package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightCalculation {
    public static void main(String[] args) {
        Height ht;
        double height;
        int age;
        ht= new Height();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age: ");
        age = scanner.nextInt();

        System.out.println("Please enter height(cm): ");
        height = scanner.nextDouble();

        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Recomended Weight is: " + df.format(ht.GetRecommendedWeight(age,height)) + " kg");
    }
}
