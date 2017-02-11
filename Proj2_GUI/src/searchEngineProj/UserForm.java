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
		Font regularFont = new Font("Serif", Font.PLAIN, 26);
		
		// to create the window frame
		JFrame myFrame = new JFrame();
		myFrame.setTitle("My Search Engine");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(100, 100, 850, 700);
		myFrame.setLayout(new BorderLayout());
		myFrame.setMinimumSize(new Dimension(850, 700));
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
		
		// to create the south panel
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		southPanel.setBackground(Color.BLUE);
		southPanel.setPreferredSize(new Dimension(850, 100));
		contentPane.add(southPanel, BorderLayout.SOUTH);
		((FlowLayout)southPanel.getLayout()).setHgap(80);
		((FlowLayout)southPanel.getLayout()).setVgap(25);
		
		// to create maintenance button
		// and add them to south panel
		maintenance = new JButton("Maintenance");
		maintenance.setFont(regularFont);
		southPanel.add(maintenance);
		
		// to add number of files label
		numberOfFiles = new JLabel("This is dummy data for now");
		numberOfFiles.setFont(regularFont);
		southPanel.add(numberOfFiles);
		
		// to add about button to south panel
		about = new JButton("About");
		about.setFont(regularFont);
		southPanel.add(about);
		
		

	}
	
	public static void main(String[] args) {
		UserForm testGui = new UserForm();
	}
}
