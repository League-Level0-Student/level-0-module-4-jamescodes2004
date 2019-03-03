package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel(
				"<html>Which is not a real fruit? <br> A: Dragon Fruit <br> B: Durian <br> C: Crazyberry</html>");
		// 11. Make another question called "question2". Use question1 above as a guide.

		question2 = new JLabel(
				"<html>Which of these animals is native to Hawaii? <br> A: Nene <br> B: Cane Toad <br> C: Apple Snail </html>");

		 question3 = new JLabel("<html>Who was the tenth president of the US<br> A: James Polk<br> B: John Tyler <br> C: William Henry Harrison </html>");

		question4 = new JLabel("<html>Which of the following wars was America's bloodiest conflict? <br> A: Civil War<br> B: World Ward 2 <br> C: World Ward 1 </html>");
	}

	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
System.out.println(keyCode);
		// 2. Make 3 int variables that hold the key codes for A, b, and C
int a = 65;
int b = 66;
int c = 67;
		// 14. Repeat steps 11, 12, and 13 for question3 and question4 - IMPORTANT: The questions must be in reverse order from top to bottom to work properly

	
		// 12. If question2 is showing,
			
			// 13. check if it is right or wrong like you did for question1
		
			
		if (question1.isShowing()) {
			// 3. If they selected the right fruit, do steps 4 and 7
			
				// 4. Call the correct() method
			if (keyCode==c) {
				correct();
				nextQuestion(question2);
			}
				// 7. Use the nextQuestion() method to go to question2
			
			
			// 8. else (if they touched something else)
			else if(keyCode==a || keyCode==b) {
				incorrect();
			}
			
				// 9. Call the incorrect() method
		
		}
if(question2.isShowing()) {
	if (keyCode==a) {
		correct();
		nextQuestion(question3);
	}
	else if (keyCode== b || keyCode== c) {
		incorrect();
	}
}
if(question3.isShowing()) {
	if (keyCode==b) {
		correct();
		nextQuestion(question4);
	}
	else if (keyCode== a || keyCode== c) {
		incorrect();
	}
}
if(question4.isShowing()) {
	if (keyCode==a) {
		correct();
System.exit(0);
	}
	else if (keyCode== b || keyCode== c) {
		incorrect();
	}
}
	}

	private void correct() {
		// 5. Find a sound for when they get a question right, and drag it into
		// the 'extra' package. It must be a .wav file.
		// There are lots on freesound.org
		// 6. Use the playSound method to play your sound
		playSound("correct.wav");

	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package. Use the
		// playSound method to play it.

	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}
