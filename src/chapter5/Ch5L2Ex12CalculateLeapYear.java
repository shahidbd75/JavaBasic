package chapter5;

import java.util.Scanner;

public class Ch5L2Ex12CalculateLeapYear {
    public static void main(String[] args) {
        System.out.println("Please enter a year");
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        final int INVALID_INPUT =-1;

        if (year != INVALID_INPUT){
            if (year%4==0 && year%100 !=0){
                System.out.println(year + " is Leap year");
            } else if(year%4==0 && year%100== 0 && year%400==0){
                System.out.println(year + " is Leap year");
            } else{
                System.out.println(year + " is not Leap year");
            }
        }else{
            System.out.println("Please enter a valid year");
        }
    }
}
