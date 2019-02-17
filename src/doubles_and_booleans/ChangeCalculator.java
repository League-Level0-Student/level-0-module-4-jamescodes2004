package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		String penny = JOptionPane.showInputDialog(null, "How many pennies do you have?");
		double penny2 = Integer.parseInt(penny);
		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
double nickels2 = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
double dimes2 = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
double quarters2 = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double Total =(double) ((penny2*.01)+(nickels2*.05)+(dimes2*.1)+(quarters2*.25));
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have a total of $" + Total);
	}
}

