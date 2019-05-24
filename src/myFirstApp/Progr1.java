package myFirstApp;

import javax.swing.*;

public class Progr1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what's your name");
        String input = JOptionPane.showInputDialog("How old are you");
        int age = Integer.parseInt(input);
        System.out.println("your name is " + name);
        System.out.println("next year you'll be " + (age + 1));
        System.exit(0);
    }
}