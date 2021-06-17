package scheduling_service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParcelSetJsonReader {
	
	ParcelSet parcelSet;
	
	public ParcelSetJsonReader() {}
	
	public ParcelSet load() {
		JSONParser parser = new JSONParser();
		try {
			Object object = parser.parse(new FileReader("D:/Args.json"));
			
			//Convert Object to JSONObject
			JSONObject jsonObject = (JSONObject) object;
			
			//Reading the String
			double capacity = (Double) jsonObject.get("capacity");
			double quota = (Double) jsonObject.get("quota");
			Long numOfParcels = (Long) jsonObject.get("numOfParcels");
					
			
			//Reading the array
			JSONArray parcels = (JSONArray)jsonObject.get("parcels");
			
			//Printing all the values
			System.out.println("Capacity: " + capacity);
			System.out.println("Quota: " + quota);
			System.out.println("Number of parcels: " + numOfParcels);
			System.out.println("Parcels: ");
			
			parcelSet = new ParcelSet(capacity,quota,numOfParcels);
			for (Object parcel : parcels) {
				JSONObject parc = ((JSONObject)parcel);
				String name = (String)parc.get("name");
				double weight = (Double)parc.get("weight");
				double value = (Double)parc.get("value");
				parcelSet.parcels.add(new ParcelObject(name, weight, value));
			}
			
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parcelSet;
	}
}
