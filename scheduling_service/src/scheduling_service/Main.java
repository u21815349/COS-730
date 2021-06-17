package scheduling_service;
import scheduling_service_AI.Output;
import scheduling_service_AI.SchedulingApp;

public class Main {

	public static void main(String [] args) {
		
		//Read Parcel list from JSON
		ParcelSetJsonReader loader = new ParcelSetJsonReader();
		ParcelSet parcelSet = loader.load();
		
		//Perform parcel sorting
		SchedulingApp schedule = new SchedulingApp();
		
		try {
			Output sortedParcels = (schedule.SortParcels(parcelSet));
			System.out.println(sortedParcels.getSolutionCrhomosome());
			
			//Write sorted parcels to JSON
			ParcelSetJsonWriter writer = new ParcelSetJsonWriter();
			writer.write(sortedParcels);
		}catch (NullPointerException ex) {
			System.out.println("No solution for given constraints");
			ErrorWriterJson jsonError = new ErrorWriterJson();
			jsonError.noSolutionForConstraints();
		}
	}
}




























/**
ParcelSet parcelSet = new ParcelSet(3,10,3);
parcelSet.parcels.add(new ParcelObject("A", 1.1, 5));
parcelSet.parcels.add(new ParcelObject("B", 2.1, 10));
parcelSet.parcels.add(new ParcelObject("C", 3.1, 15));
**/

/**ParcelSet parcelSet = new ParcelSet(5,10,9);
parcelSet.parcels.add(new ParcelObject("A", 70.2, 260.4));
parcelSet.parcels.add(new ParcelObject("B", 60.1, 245.4));
parcelSet.parcels.add(new ParcelObject("C", 50.1, 200.3));
parcelSet.parcels.add(new ParcelObject("D", 40.9, 100.4));
parcelSet.parcels.add(new ParcelObject("E", 30.2, 80.2));
parcelSet.parcels.add(new ParcelObject("F", 20.5, 65.76));
parcelSet.parcels.add(new ParcelObject("G", 10.6, 60.4));
parcelSet.parcels.add(new ParcelObject("H", 70.5, 260.76));
parcelSet.parcels.add(new ParcelObject("I", 1.4, 10.34));
*/		

//SchedulingApp schedule = new SchedulingApp();
//schedule.SortParcels(parcelSet);