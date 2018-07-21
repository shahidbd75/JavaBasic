package chapter6;

import java.util.Scanner;

public class Ch6Level2Problem18 {
    private static int input = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        input = scanner.nextInt();
        checkInput(input);



    }
    public static int checkInput(int i){
        if(i<0){
            System.out.println("This number is negative: ");
        }
        else{
            int length = (int) (Math.log10(i) + 1);
            System.out.println("Length is: " + length);
            System.out.print("Enter the number till which the prime numbers are to be calculated: ");
            Scanner scanner1 = new Scanner(System.in);
            int k = scanner1.nextInt();
            checkInput(k);
        }
        return 0;
    }

}
