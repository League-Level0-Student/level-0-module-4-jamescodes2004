package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		for (int i = 0; i < 1000; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
String number1 = JOptionPane.showInputDialog(null, "Give me a number");
String number2 = JOptionPane.showInputDialog(null, "Give me another number");
double num1 = Integer.parseInt(number1);
double num2 = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which operation do you want to use?", "Operation", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
double divide = num1/num2;
double add=num1+num2;
double subtract=num1-num2;
double multiply=num1*num2;
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==3) {
	JOptionPane.showMessageDialog(null, number1 + "/"+ number2 + "="+ divide);
}
if (operation==0) {
	JOptionPane.showMessageDialog(null, number1 + "+"+ number2 + "="+ add);
}
if (operation==1) {
	JOptionPane.showMessageDialog(null, number1 + "-"+ number2 + "="+ subtract);
}
if (operation==2) {
	JOptionPane.showMessageDialog(null, number1 + "*"+ number2 + "="+ multiply);
}
int Calculator = JOptionPane.showOptionDialog(null, "Do you want to make another calculation?", "Calculator", 0,
		JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No"},
		null);
if (Calculator==0) {
	i=i+1;
}
if (Calculator==1) {
	JOptionPane.showMessageDialog(null, "Have a nice day ;)");
	System.exit(0);}
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		int num3 = num1+num2;
		System.out.println(num3);}
		// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int num1, int num2) {
		int num3 = num1-num2;
		System.out.println(num3);}
	static void multiply(int num1, int num2) {
		int num3 = num1+num2;
		System.out.println(num3);}
	static void divide(int num1, int num2) {
		int num3 = num1+num2;
		System.out.println(num3);}
}