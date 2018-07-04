package chapter5;

import java.util.Scanner;

public class Ch5L2Ex13CalculateWage {
    public static void main(String[] args) {
        System.out.print("Please enter total hour: ");
        Scanner scanner = new Scanner(System.in);

        final double BASIC_HOURLY_WAGE = 7.25;
        int inputHour;
        double hourlySalery,totalSales,totalCommission,finalWage;

        inputHour = scanner.nextInt();
        System.out.print("Please enter total sales: ");
        totalSales  =scanner.nextDouble();

        hourlySalery = inputHour * BASIC_HOURLY_WAGE;

        // Comission Calculation
        if (totalSales >=1 && totalSales <=99.99){
            totalCommission = (totalSales*5)/100;
        } else if(totalSales >=100 && totalSales <=299.99){
            totalCommission = (totalSales*10)/100;
        } else if(totalSales >=300){
            totalCommission = (totalSales*15)/100;
        } else{
            totalCommission =0;
        }
        finalWage = hourlySalery + totalCommission;

        System.out.println("The wage: " + finalWage);
    }
}
