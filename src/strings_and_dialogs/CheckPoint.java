package strings_and_dialogs;


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
String color = 	JOptionPane.showInputDialog(null,"What is your favorite color");
JOptionPane.showMessageDialog(null, color + " is also my favorite color");
Robot cesar = new Robot();
cesar.penDown();
for(int i=0;i<3; i++){
cesar.turn(120);
 cesar.move(200);


}
	
	
	
	
	
	
}
}