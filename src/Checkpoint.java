import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("Whats your favorite color?");
		JOptionPane.showMessageDialog(null, color + " is also my favorite color!");
		Robot robo = new Robot("mini");
		robo.setSpeed(100);
		robo.penDown();
		for (int i = 0; i < 3; i = i + 1) {
			robo.move(100);
			robo.turn(120);
		}

	}

}
