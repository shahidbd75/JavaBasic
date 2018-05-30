package chapter2;

import java.util.Scanner;

public class L1NameConcate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name");
        String fName = sc.next();
        System.out.println("Please enter last name");
        String lName = sc.next();

        String fullName = lName + ", " + fName;
        System.out.println(fullName);
    }
}
