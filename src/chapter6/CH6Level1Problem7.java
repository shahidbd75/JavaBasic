/**
 * Calculate Prime Number
 */
package chapter6;

import java.util.Scanner;

public class CH6Level1Problem7 {
    public static void main(String[] args) {
        int input = 0;
        Scanner s = new Scanner(System.in);
        while (input >= 0){
            System.out.println("Please enter number: ");
            input = s.nextInt();
            if (input <=0){
                System.out.println("Please enter a valid number");
            } else {
                boolean isPrime = isPrimeNumber(input);
                if (isPrime) {
                    System.out.println(input + " is a prime number");
                } else {
                    System.out.println(input + " is not a prime number");
                }
            }
        }
    }

    private static boolean isPrimeNumber(int number){
        if (number ==0 || number==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number %i==0){
                return  false;
            }
        }
        return true;
    }
}
