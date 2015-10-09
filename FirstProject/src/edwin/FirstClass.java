package edwin;
import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Edwin on 30/07/2015.
 */
public class FirstClass {

    public static void main(String [] args){
        String firstNumber = JOptionPane.showInputDialog("Enter First Number Please");

        int num1 = Integer.parseInt(firstNumber);

        String secondNumber = JOptionPane.showInputDialog("Enter Second Number Please");
        int num2 = Integer.parseInt(secondNumber);

        int sum = num1 * num2;

        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);

        System.exit (0);


    }

}
