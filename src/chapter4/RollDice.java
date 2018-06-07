package chapter4;

public class RollDice {
    public static void main(String[] args) {
        Die die;
        die = new Die( );
        die.roll();
        System.out.println("First time result:" + die.getNumber());
        die.roll();
        System.out.println("Second time result:" + die.getNumber());
        die.roll();
        System.out.println("Third time result:" + die.getNumber());
    }
}
