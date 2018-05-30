package chapter2;

import java.util.Scanner;

public class L3_27StringOperation {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence");
        Scanner s =new Scanner(System.in);

        String input = s.nextLine();

        int length = input.length();
        System.out.println("String Length: " + length);

        String firstLetter  = input.substring(0,1);
        System.out.println("First Letter: " + firstLetter);

        String lastLetter  = input.substring(input.length() -1,input.length());
        System.out.println("First Letter: " + lastLetter);
    }
}
