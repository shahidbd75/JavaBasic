package chapter5;

import java.util.Scanner;

public class Ch5L3Ex18Order {
    public static void main(String[] args) {
        System.out.println("Please enter Number of bag ordered: ");
        Scanner scanner = new Scanner(System.in);

        int numberOfBag,discount;
        final double EACH_BAG_BEAN_COST = 5.50;
        double total,totalAfterDiscount,discountAmount;

        numberOfBag = scanner.nextInt();

        total = numberOfBag * EACH_BAG_BEAN_COST;

        if (numberOfBag >= 0){
            if(numberOfBag >= 300){
                discount = 30;
                discountAmount = (total * discount)/100;
            }else if (numberOfBag >=200){
                discount = 25;
                discountAmount = (total * discount)/100;
            }else if (numberOfBag >=150){
                discount = 20;
                discountAmount = (total * discount)/100;
            }else if (numberOfBag >=100){
                discount = 15;
                discountAmount = (total * discount)/100;
            }else if (numberOfBag >=50){
                discount = 10;
                discountAmount = (total * discount)/100;
            }else if (numberOfBag >=25){
                discount = 5;
                discountAmount = (total * discount)/100;
            }else{
                discount =0;
                discountAmount = 0;
            }
            totalAfterDiscount = total - discountAmount;

            System.out.println("Number of Bags Ordered: " +numberOfBag + " - $ " +total);
            System.out.println("Discount: " +discount + "% - $ " + discountAmount);
            System.out.println("Your total charge is: $ " + totalAfterDiscount);
        } else  {
            System.out.println("Please enter valid bag");
        }
    }
}
