package testJPaneConcept;

import javax.swing.*;

public class Test1 {

	public static void main(String[] args) {
	    String firstNumber = JOptionPane.showInputDialog("Enter First Number Please");
        String secondNumber = JOptionPane.showInputDialog("Enter Second Number Please");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        int sum = num1 * num2;

        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);

	
	}

}
