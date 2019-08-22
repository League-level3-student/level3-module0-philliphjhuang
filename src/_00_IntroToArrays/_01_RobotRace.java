package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robot = new Robot[9];
		// 3. use a for loop to initialize the robots.
		for (int x = 0; x < robot.length; x++) {
			robot[x] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robot[x].setY(550);
			robot[x].setX(50+x*100);
			robot[x].setSpeed(100);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random y = new Random();
		boolean raceOver = false;
		while (raceOver == false) {
			for (int c = 0; c < robot.length; c++) {

				int z = y.nextInt(50);
				robot[c].move(z);

				if (robot[c].getY() <= 0) {
					robot[c].setSpeed(0);
					raceOver = true;
					JOptionPane.showMessageDialog(null, "Robot " + (c + 1) + " won.");
					break;
				}
			}

		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

	}
}