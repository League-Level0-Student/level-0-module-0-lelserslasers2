import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		Robot robo = new Robot("mini");
		robo.setSpeed(100);
		robo.penDown();
		robo.move(100);
		robo.turn(150);
		robo.move(75);
		robo.turn(-120);
		robo.move(75);
		robo.turn(150);
		robo.move(100);
	}

}
