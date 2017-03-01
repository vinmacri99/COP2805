package searchEngineProj;

import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileMgmt {
	
    // default constructor
    public FileMgmt() throws IOException { 
        // read the index data from a file at startup into memory
//        File startupFile = new File("search_data.txt");
//        if (!startupFile.exists()) {
//            JOptionPane.showMessageDialog(null, "File not found.", 
//                "Error", JOptionPane.OK_OPTION); 
//        }
    }
    
    	///////  FILE MAINTENANCE METHODS  ///////  
	
    // Add sourceFile to the targetIndexFiles
    public void addFileToIndex()  throws IOException {
                            
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {                               

            //get selected file, store path in a string, call method to write path to Maint. window
            File file = fileChooser.getSelectedFile();
            String filePath = file.getPath();
            writeFileToWindow(filePath);          // this method is below

            // get new file and save it in an array for indexing
            saveFilePathForSearching(filePath);          

            // create a Scanner for the file (PrintWindow for output)
            Scanner input = new Scanner(file);

            // read text from the file
            while (input.hasNext() ) {
                
            }
            input.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "No file selected.", 
                "Abort", JOptionPane.OK_OPTION);
        }
            
//			JOptionPane.showMessageDialog(null, "Operation not yet available", 
//					"Temporaty Message", JOptionPane.OK_OPTION);
    }
    
    // Remove a file from targetIndexFiles
    public void removeFileFromIndex() {
        
    }
    
    // Read targetIndexFiles
    public void readIndexFile() {
        
    }
    
    // save file in array for searching with InvertedIndex.java
    public void saveFilePathForSearching(String s) {
        
    }
    
    // write file path to display in maintenance window
    public void writeFileToWindow(String s) {

        // display results in maintenance window
        //MaintenanceGui.displayName(s);
        
        // temporary console output for testing
        System.out.println(s);

    }
    
    // clearing files for new search data
    // note: this will also need to clear the search results in the Search Window
    public void removeFileList() {
        
    }
    
}
