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

public class searchEngineModel {

	private String indexData = "..\\..\\resources\\indexData.txt";
	
	
	public void writeData(HashMap<String, HashMap<Integer, Integer>> outerMap, 
			HashMap<Integer, Integer> innerMap) {
		
		try {
			// to create a decorated FileOutputSream
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream(indexData)));
			
			// Not sure if this is how is done yet
			for (String key: outerMap.keySet()) {
				out.printf("%s:", outerMap.get(key));
				for(Integer innerKey: innerMap.keySet()) {
					out.printf(" (%d,%d)", innerMap.get(innerKey));
				}
				out.printf("\n");
			}
			
		} catch (FileNotFoundException e) {
			System.err.printf("Cannot open %s", indexData);
			e.printStackTrace();
		}
		
		
	}
}
