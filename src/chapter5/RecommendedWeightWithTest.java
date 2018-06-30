package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RecommendedWeightWithTest {
    public static void main(String[] args) {
        WeightCalc wc;
        double height;
        int age;
        wc= new WeightCalc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age: ");
        age = scanner.nextInt();

        System.out.println("Please enter height(cm): ");
        height = scanner.nextDouble();

        DecimalFormat df=new DecimalFormat("0.00");
        if (height >= 140 && height <=230) {
            System.out.println("Recomended Weight is: " + df.format(wc.GetRecommendedWeight(age, height)) + " kg");
        }else{
            System.out.println("Invalid height. please enter height between 140 and 230");
        }
    }
}
