package scheduling_service;

import java.util.ArrayList;

public class ParcelSet {
	double capacity;
	double quota;
	int numberOfParcels;
	public ArrayList<ParcelObject> parcels = new ArrayList<>();
	
	public ParcelSet(double capacity, double quota, int numOfParcels) {
		this.capacity = capacity;
		this.quota = quota;
		this.numberOfParcels = numOfParcels;
	}
	
	
	public double getCapacity() {
		return capacity;
	}

	public double getQuota() {
		return quota;
	}
	
	public int getNumberOfParcels() {
		return numberOfParcels;
	}
	
}
