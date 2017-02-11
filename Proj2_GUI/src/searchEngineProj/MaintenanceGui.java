/** @author Flavio Aquino February 2017
 * 
 *  Class responsible for creating the  Administrator
 *  GUI.
 */

package searchEngineProj;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MaintenanceGui {
	JLabel title, numberOfFiles;
	JButton addFile, updateFile, removeFile;
	JTable table;
	
	public MaintenanceGui() {
		Font titleFont = new Font("Serif", Font.BOLD, 46);
		Font regularFont = new Font("Serif", Font.PLAIN, 26);
		
		// to create the window frame
		JFrame myFrame = new JFrame();
		myFrame.setTitle("My Search Engine Maintenance");
		myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		myFrame.setLayout(new BorderLayout());
		myFrame.setMinimumSize(new Dimension(950, 650));
		myFrame.setVisible(true);
		
		// a container to place the panels in it
		Container contentPane = myFrame.getContentPane();
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLUE);
		northPanel.setLayout(new BorderLayout());
		northPanel.setPreferredSize(new Dimension(850, 100));
		northPanel.setBorder(new EmptyBorder(0, 0, 0, 20));
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		// to create and add title label to north panel
		title = new JLabel("My Search Engine - Maintenance");
		title.setFont(titleFont);
		title.setHorizontalAlignment(JLabel.CENTER);
		northPanel.add(title, BorderLayout.CENTER);
	}
	
}
