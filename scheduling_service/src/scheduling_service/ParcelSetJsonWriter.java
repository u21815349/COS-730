package scheduling_service;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import scheduling_service_AI.Output;

public class ParcelSetJsonWriter {

	@SuppressWarnings("unchecked")
	public int write(Output sortedParcels) {
		try {
			//Create a writer
			FileWriter writer = new FileWriter("D:/Args.json");
			
			//Output set object
			JSONObject output = new JSONObject();
			output.put("value", sortedParcels.getFitness());
			output.put("weight", sortedParcels.getWeight());
			
			//Output Parcel list
			JSONArray parcelArray = new JSONArray();
			for (String parcel : sortedParcels.getSolutionCrhomosome())
				parcelArray.add(parcel); 
			
			output.put("sortedParcels", parcelArray);	
			writer.write(output.toJSONString());
			
			writer.close();
			return 0;
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return 1;
	}
	
}
