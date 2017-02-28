package searchEngineProj;

import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;

public class FileMgmt {
	
    // default constructor
    public FileMgmt() throws IOException { 
        // read the index data from a file at startup into memory
        File startupFile = new File("search_data.txt");
        if (!startupFile.exists()) {
            JOptionPane.showMessageDialog(null, "File not found.", 
                "Error", JOptionPane.OK_OPTION); 
        }
    }
    
    	///////  FILE MAINTENANCE METHODS  ///////  
	
    // Add sourceFile to the targetIndexFiles
    public void addFileToIndex()  throws IOException {
                            
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {                               

            //get selected file
            java.io.File file = fileChooser.getSelectedFile();
            String filePath = file.getAbsolutePath();

            // get new file and save it to current file for indexing
            

            // write file path to display in maintenance window
            writeFileToWindow(filePath);

            // create a Scanner for the file
            Scanner input = new Scanner(file);

            // read text from the file
            while (input.hasNext() ) {
                // write to file new file
                
            }
            // close the file
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
