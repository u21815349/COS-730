package scheduling_service;

public class ParcelObject {
	String name;
	double weight;
	double value;
	
	public ParcelObject(String name, double weight, double value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getValue() {
		return value;
	}
	
	
}
