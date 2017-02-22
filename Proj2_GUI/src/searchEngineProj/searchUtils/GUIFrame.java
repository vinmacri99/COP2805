/** @author Flavio Aquino, Sharon Tender, Frank Castillo,
 * Vinny Macri February 2017
 */

package searchEngineProj.searchUtils;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIFrame extends JFrame {
    // Components
    JTextField userInput = new JTextField();
    JLabel windowTitle = new JLabel("Search Engine");    
    JButton searchAllBtn = new JButton("Search All Words");
    JButton searchAnyBtn = new JButton("Search Any Word");
    JButton searchExactBtn = new JButton("Search Exact Phrase");    
    JButton indexbtn = new JButton("Open Search Files");
    JButton aboutbtn = new JButton("About The A-Team");
    JButton clearbtn = new JButton("Clear");   
   
	public GUIFrame() {
        setResizable(false);
		setTitle("Search Engine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 800, 600);
        Color colorGrey = new Color(220,220,220);
        Color colorGreen = new Color(204,255,153);
        
        // Title for window
        JPanel pWindow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pWindow.add(windowTitle);
        Font titleFont = new Font("Bodoni MT", Font.PLAIN, 44);
        windowTitle.setFont(titleFont);
        
        // Search buttons
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        TitledBorder title = new TitledBorder("Select a Search Option");
        p1.setBorder(title);
        p1.add(searchAllBtn);
        p1.add(searchAnyBtn);
        p1.add(searchExactBtn);
        
        // search text box
        JPanel p2 = new JPanel(new GridLayout(1,5,40,40));
        TitledBorder inputTitle = new TitledBorder("Enter text to search");
        p2.setBorder(inputTitle);
        p2.add(userInput);
        userInput.setBounds(10, 10, 100, 10);  // tried to make this height smaller, but doesn't work
        
        // search results text box
        JPanel p3 = new JPanel(new GridLayout(2,1,0,0));
        TitledBorder resultsTitle = new TitledBorder("Search Results");
        Border lineBorder = new LineBorder(Color.ORANGE, 1);
        resultsTitle.setBorder(lineBorder);
        p3.setBorder(resultsTitle);
        
        // Maintenance/Index options and close buttons
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        TitledBorder optionsTitle = new TitledBorder("Other Options");
        p4.setBorder(optionsTitle);
        p4.add(indexbtn);
        p4.add(aboutbtn);
        p4.add(clearbtn);
        
        // display all panels
        setLayout(new GridLayout(5,1,30,0));
        add(pWindow).setBackground(colorGreen);
        add(p2).setBackground(colorGreen);
        add(p1).setBackground(colorGreen);
        add(p3).setBackground(Color.WHITE);
        add(p4).setBackground(colorGreen);
        
        pack();
        
        // event listeners for buttons
        searchAllBtn.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "User Input: " + userInput.getText(), 
					"Warning Will Robinson!", JOptionPane.OK_OPTION);
		});
        
        searchAnyBtn.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "User Input: " + userInput.getText(), 
					"Warning Will Robinson!", JOptionPane.OK_OPTION);
		});        
        
        searchExactBtn.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "User Input: " + userInput.getText(), 
					"Warning Will Robinson!", JOptionPane.OK_OPTION);
		});
        
        indexbtn.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "This will bring up the Index Window to select files for searching", 
					"Warning Will Robinson!", JOptionPane.OK_OPTION);
		});
        
        aboutbtn.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "The A-Team: Flavio, Frank, Vinny, and Sharon", 
					"Warning Will Robinson!", JOptionPane.OK_OPTION);
		});
        
        clearbtn.addActionListener(actionEvent -> {
			JOptionPane.showMessageDialog(null, "This will clear text area.", 
					"Warning Will Robinson!", JOptionPane.OK_OPTION);
		});         
   	}
}