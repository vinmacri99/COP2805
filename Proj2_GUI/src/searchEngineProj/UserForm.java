/** @author Flavio Aquino February 2017
 * 
 *  Class responsible for creating the user Gui
 */

package searchEngineProj;

import java.awt.*;
import javax.swing.*;

public class UserForm {
	JLabel title, searchItem, numberOfFiles, ouputTitle, output;
	JTextField input;
	JButton search, maintenance, about;
	JRadioButton andSearch, orSearch, exactPhrase;
	
	public UserForm() {
		// to create the window frame
		JFrame myFrame = new JFrame();
		myFrame.setTitle("My Search Engine");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(100, 100, 850, 700);
		myFrame.setLayout(new BorderLayout());
		myFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		UserForm testGui = new UserForm();
	}
}
