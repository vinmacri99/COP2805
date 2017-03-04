/** searchEngineModel.java - Class responsible for
 *  handling the persistence data of my search engine 
 * 
 * @author Flavio Aquino March 2017
 *  
 */

package searchEngineProj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class searchEngineModel {

	private String indexData = "..\\..\\resources\\indexData.txt";
	
	
	public void writeData(HashMap<String, Set<Integer>> invertedIndex) {
		
		try {
			// to create a decorated FileOutputSream
			@SuppressWarnings("resource")
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream(indexData)));
			
			// To iterate over the HashMap
			for(HashMap.Entry<String, Set<Integer>> entry: invertedIndex.entrySet()) {
				// To iterate over each entry
				for(Integer documentAndPosition: entry.getValue()) {
					out.println(entry.getKey() + ": " + documentAndPosition + ", ");
				}				
			}
			
		} catch (FileNotFoundException e) {
			System.err.printf("Cannot open %s", indexData);
			e.printStackTrace();
		}
		
		
	}
}
