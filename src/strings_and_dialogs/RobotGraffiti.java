package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot bob = new Robot();
	bob.penDown();
	bob.setSpeed(500);
	for(int i=0;i<3;i++){
	bob.turn(-90);	
	bob.move(200);
	}
}
}