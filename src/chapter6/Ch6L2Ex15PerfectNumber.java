package chapter6;

public class Ch6L2Ex15PerfectNumber {
    public static void main(String[] args) {

    }

    public static Boolean isPrimeNumber(int number){
        int temp=0;
        for (int i=1;i<= number/2;i++){
            if (number%i==0){
                temp +=i;
            }
        }
        if (number==temp){
            return true;
        }
        return false;
    }
}
