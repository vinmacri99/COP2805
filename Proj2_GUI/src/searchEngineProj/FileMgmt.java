package searchEngineProj;

import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileMgmt {
	public String filePath;
    // default constructor
    public FileMgmt() throws IOException { 
        // read the index data from a file at startup into memory

    }
    
    	///////  FILE MAINTENANCE METHODS  ///////  
	
    // Add sourceFile to the targetIndexFiles
    public void addFileToIndex()  throws IOException {
                            
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {                               

            //get selected file, store path in a string, call method to write path to Maint. window
            File file = fileChooser.getSelectedFile();
            filePath = file.getPath();
            writeFileToWindow(filePath);                   // this method is below, has not been created yet
            
            // get new file and save it in an array for indexing
            saveFilePathForSearching(filePath);            // this method is below, has not been created yet

            // create target file and see if it exists
            File output = new File("Output.txt");
            System.out.println(output.getPath());
            // 
            PrintWriter copyFile = new PrintWriter(
                                   new BufferedWriter(
                                   new FileWriter(output)));
            
            // FOR TESTING: create a Scanner for the file this is for printing to the console
            Scanner input = new Scanner(file);
            while (input.hasNext() ) {
                String line = input.nextLine();
                System.out.println(line);                
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
//        File[] fileListing = s;  // save the list of files in an array
//        fileListing.listFiles() //File[] listFiles() Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.
    }
    
    // write file path to display in maintenance window
    public void writeFileToWindow(String s) {        
        System.out.println(s);                      // temporary console output for testing
    }
    
    // clearing files for new search data
    // note: this will also need to clear the search results in the Search Window
    public void removeFileList() {
        
    }
    
}
