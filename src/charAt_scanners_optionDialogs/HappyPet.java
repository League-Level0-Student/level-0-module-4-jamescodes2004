package charAt_scanners_optionDialogs;

import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog(null, "What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 5; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?",
					"Pet Questionere", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed my " + pet, "Take my " + pet + " out for a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				int num = new Random().nextInt(2);
				if (num == 0) {
					JOptionPane.showMessageDialog(null, "Your " + pet + " whines");
					happinessLevel = happinessLevel - 1;
					JOptionPane.showMessageDialog(null, "Your pets hapiness has gone down.");
				} else {
					JOptionPane.showMessageDialog(null,
							"Your " + pet + " hops on the couch with you and you give him/her a belly scratch.");
					happinessLevel = happinessLevel + 1;
					JOptionPane.showMessageDialog(null, "Your pets happiness has increased");
				}
			}
			if (task == 1) {
				int num1 = new Random().nextInt(2);
				if (num1 == 0) {
					JOptionPane.showMessageDialog(null, "Your " + pet + " isn't hungry and slaps his/her food bowl.");
					happinessLevel = happinessLevel - 2;
					JOptionPane.showMessageDialog(null, "Your pets hapiness has decreased.");
				} else {
					JOptionPane.showMessageDialog(null,
							"Your " + pet + " devours his food and begs for a treat, which you obviously give to him.");
					happinessLevel = happinessLevel + 2;
					JOptionPane.showMessageDialog(null, "Your pet's love for you has gone up by alot.");
				}
			}
			if (task == 2) {
				int num2 = new Random().nextInt(2);
				if (num2 == 0) {
					JOptionPane.showMessageDialog(null,
							"Your " + " pet makes it through the walk, comes back, and goes to sleep");
					happinessLevel = happinessLevel - 1;
					JOptionPane.showMessageDialog(null,
							"Your pets happiness has decreased by an incredibly small amount.");
				} else {
					JOptionPane.showMessageDialog(null, "Your " + pet
							+ " pees, poops and socializes during his walk and comes back with so much energy.");
					happinessLevel = happinessLevel + 3;
					JOptionPane.showMessageDialog(null, "Your pets happiness has soared!");
				}
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
		}

		if (happinessLevel > 2)
			JOptionPane.showMessageDialog(null, "You really do love your " + pet);
		if (happinessLevel < 3 && happinessLevel > -1)
			JOptionPane.showMessageDialog(null, "You have a normal relationship with your " + pet);
		if (happinessLevel < 0)
			JOptionPane.showMessageDialog(null, "Your " + pet + " hates you!");
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}