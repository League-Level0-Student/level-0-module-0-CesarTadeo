package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String n =JOptionPane.showInputDialog(null,"What Is Your Name")	;
JOptionPane.showMessageDialog(null,"Hi,"+n);
	
}
}
