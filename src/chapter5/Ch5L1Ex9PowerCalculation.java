package chapter5;

import java.util.Scanner;

public class Ch5L1Ex9PowerCalculation {
    public static void main(String[] args) {
        System.out.println("Please enter the power of 10");
        Scanner scanner =new Scanner(System.in);

        int power  = scanner.nextInt();

        if (power > 0) {
            if (power >= 100) {
                System.out.println("Googol");
            } else if (power >= 30 && power < 100) {
                System.out.println("Nonillion");
            } else if (power >= 21 && power < 30) {
                System.out.println("Sextillion");
            } else if (power >= 18 && power < 21) {
                System.out.println("Quintillion");
            } else if (power >= 15 && power < 18) {
                System.out.println("Quadrillion");
            } else if (power >= 12 && power < 15) {
                System.out.println("Trillion");
            } else if (power >= 9 && power < 12) {
                System.out.println("Billion");
            } else if (power >= 6 && power < 9) {
                System.out.println("Million");
            } else {
                System.out.println("Amount is less than million");
            }
        }else{
            System.out.println("Please enter valid number");
        }
    }
}
