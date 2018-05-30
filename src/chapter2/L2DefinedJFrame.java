package chapter2;

import javax.swing.*;
import java.util.Scanner;

public class L2DefinedJFrame {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the title of the window");
        String title = sc.nextLine();
        System.out.println("Please enter width of the window");
        int W = sc.nextInt();
        System.out.println("Please enter height of the window");
        int H = sc.nextInt();

        jFrame.setSize(W,H);
        jFrame.setTitle(title);
        jFrame.setVisible(true);
    }
}
