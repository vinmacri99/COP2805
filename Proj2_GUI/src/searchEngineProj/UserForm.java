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
		Font titleFont = new Font("Serif", Font.BOLD, 36);
		Font regularFont = new Font("Serif", Font.PLAIN, 20);
		
		// to create the window frame
		JFrame myFrame = new JFrame();
		myFrame.setTitle("My Search Engine");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(100, 100, 850, 700);
		myFrame.setLayout(new BorderLayout());
		myFrame.setVisible(true);
				
		// to create a panel for the main title
		Container contentPane = myFrame.getContentPane();
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLUE);
		northPanel.setPreferredSize(new Dimension(850, 100));
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		// to create and add the title to north panel
		title = new JLabel("My Search Engine");
		title.setFont(titleFont);
		northPanel.add(title);
	}
	
	public static void main(String[] args) {
		UserForm testGui = new UserForm();
	}
}
