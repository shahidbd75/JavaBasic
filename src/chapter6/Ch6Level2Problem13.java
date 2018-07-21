package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch6Level2Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = scanner.nextInt();
        scanner.close();

        long startTime = System.nanoTime();

        List<Integer> primes = new ArrayList<Integer>();
        
        for (int i = 2; i < input; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                primes.add(i);
            }
        }

        System.out.println("The number of prime number is: " + primes.size());

        long endTime = System.nanoTime();
        System.out.format("Execution Time Is = %s Nano Second, ( Start Time : %s, End Time: %s ) \n", (endTime - startTime),startTime, endTime);
    }
}
