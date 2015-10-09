package additionPackage;

import javax.swing.JOptionPane;

public class TestSwingProject {

	public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
//        System.out.println("Please enter number one: ");
//        int num1 = scan.nextInt();
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
//        System.out.println("Please enter number two: ");
//        int num2 = scan.nextInt();

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
//			int additionAnswer = num1 + num2;

        int sum = num1 * num2;

        JOptionPane.showMessageDialog (null, "The answer is " + sum, "Results",JOptionPane.PLAIN_MESSAGE);
//			int divisionAnswer = num2 /num1;

//			int subtractionResult = num1 - num2;

//			int muduloAnswer = num1%num2;

        System.out.println(sum);
        System.exit ( 0 );
	}

}
