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
		
		// TODO create table and add it to center panel
		
		

		// to create and add south panel
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.BLUE);
		southPanel.setLayout(new FlowLayout());
		((FlowLayout)southPanel.getLayout()).setHgap(70);
		((FlowLayout)southPanel.getLayout()).setVgap(30);
		southPanel.setPreferredSize(new Dimension(850, 150));
		contentPane.add(southPanel, BorderLayout.SOUTH);
		
		// to create buttons and add them to south panel
		addFile = new JButton("Add File");
		addFile.setFont(regularFont);
		southPanel.add(addFile);
		
		addFile.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "Operation not yet available", 
					"Temporaty Message", JOptionPane.OK_OPTION);
		});
		
		updateFile = new JButton("Update Index File");
		updateFile.setFont(regularFont);
		southPanel.add(updateFile);
		
		updateFile.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "Operation not yet available",
					"Temporary Message", JOptionPane.OK_OPTION);
		});
		
		removeFile = new JButton("Remove Selected File");
		removeFile.setFont(regularFont);
		southPanel.add(removeFile);
		
		removeFile.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "Operation not yet available",
					"Temporary Message", JOptionPane.OK_OPTION);
		});
		
		// nested panel to put the number of file
		// label in a different line
		JPanel southPanel2 = new JPanel();
		southPanel2.setLayout(new FlowLayout());
		((FlowLayout)southPanel2.getLayout()).setVgap(5);
		southPanel2.setBackground(Color.BLUE);
		southPanel2.setPreferredSize(new Dimension(850, 100));
		numberOfFiles = new JLabel("This is dummy data for now");
		numberOfFiles.setFont(regularFont);
		southPanel2.add(numberOfFiles);
		southPanel.add(southPanel2);
				
		myFrame.pack();
	}
	
}
