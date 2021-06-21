package scheduling_service;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class ErrorWriterJson {
	
	public ErrorWriterJson() {
	}
	
	
	public int noSolutionForConstraints() {
		//Output set object
		JSONObject output = new JSONObject();
		output.put("Error", "noSolution");
		try {
			FileWriter writer = new FileWriter("D:/Args.json"); 
			writer.write(output.toJSONString());
			writer.close();
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
			return 1;
		}
	}
	
	
}
