package searchEngineProj;

//* GuiMaint program.
//* The second window frame which is initiated by GuiFrame1.
//* The window provides for maintenance or adjustments. Like adding or deleting files.
//* Written by Vinny Macri, Tampa, FL USA, Feb. 2017.
//* New Program - 2017 VL 1.0.
//*  ===============================================================================================================
//*

	import java.awt.FlowLayout;
	import java.awt.event.*;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	
	
	public class GuiMaint extends JFrame {

	     JTextArea searchTextArea;
	     JLabel  headerLabel;
	     JLabel  topLineLabel;
	     JLabel  fileLabel;
	     JLabel  statusLabel;
	     JButton addFileButton;
	     JButton deleteFileButton; 
	   
//Componants required for the Maintenance Window interface.

//JScrollPane scrollPane;
	     public GuiMaint() {
	            
	            setLayout(new FlowLayout());

	            headerLabel = new JLabel("A- Team Search Engine Maintenance");
	            add(headerLabel);

	            topLineLabel = new JLabel("A-Team Search Engine File Maintenance");
	            add(topLineLabel);

	            fileLabel = new JLabel(" File Name ");
	            add(fileLabel);

	            statusLabel = new JLabel(" File Status ");
	            add(statusLabel);
	            
	            searchTextArea = new JTextArea(10, 35);
	            add(searchTextArea);
	           
	            addFileButton = new JButton("Add Files ");
	            add(addFileButton);
	            addFileButton.addActionListener(new ActionListener() {
	            public void actionPerformed( ActionEvent e) { 
	                  String text = searchTextArea.getText();
	          	}
	       }
	                );
	            
	            deleteFileButton = new JButton("Delete Files ");
	  	        add(deleteFileButton);
	  	        deleteFileButton.addActionListener(new ActionListener() {
	  	          public void actionPerformed( ActionEvent e) { 
	  	                  String text = searchTextArea.getText();    

	            }    
	       }
	        );
	}
	   

	         }   //  end GuiMaint class



	//end program          
	        

