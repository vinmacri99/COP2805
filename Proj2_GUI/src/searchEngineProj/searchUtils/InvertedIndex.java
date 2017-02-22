/** @author Flavio Aquino, Sharon Tender, Frank Castillo,
 * Vinny Macri February 2017
 */

package searchEngineProj.searchUtils;

import java.io.*;
import java.io.IOException;
import java.lang.*;

public class InvertedIndex  {
    
    // variables: s will change as we work on the methods
    String s;
    
    // create constructor
    public void InvertedIndex() {
    
    }

	///////  FILE MAINTENANCE METHODS  ///////  
	
    // Add sourceFile to the targetIndexFiles
    public void addFileToIndex() {
        
    }
    
    // Remove a file from targetIndexFiles
    public void removeFileFromIndex() {
        
    }
    
    // Read targetIndexFiles
    public void readIndexFile() {
        
    }
    
    // write targetIndexFiles to Maintenance Window: fileList
    public void writeFileToWindow() {
        
    }
    
    // clearing files for new search data
    // note: this will also need to clear the search results in the Search Window
    public void removeFileList() {
        
    }
	
	///////  SEARCH WINDOW METHODS  ///////
	
	// method for displaying data (SEARCH window)
	public String displayData() {
		return s;
	}  

	
	///////  SEARCH METHODS  ///////
	// Search AND
	public String andIndexSearch() {
		return s;
	}
	
	// Search OR
	public String orIndexSearch() {
		return s;
	}
	
	// Search PHRASE
	public String phraseIndexSearch() {
		return s;
	}	
	
    // close file 
    public void closeFile(){
        
    }
}
