//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
		
	
	// 2. Get the user to enter a question for the 8 ball to answer
	String Question = JOptionPane.showInputDialog("Enter A Question For The Eight Ball!");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
int Ball8 = new Random().nextInt(4);
	
	// 4. If the random number is 0
	if (Ball8 == 0) {
		JOptionPane.showMessageDialog(null, "Yes");	
	}
	// -- tell the user "Yes"
	
	// 5. If the random number is 1
	if (Ball8 == 1) {
		JOptionPane.showMessageDialog(null, "No");	
	}
	// -- tell the user "No"

	// 6. If the random number is 2
	if (Ball8 == 2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");	
	}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
	if (Ball8 == 3) {
		JOptionPane.showMessageDialog(null, "You Deside!");	
	}
	// -- write your own answer

}
}