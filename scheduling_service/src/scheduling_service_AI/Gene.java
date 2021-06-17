/**
 * 
 */
package scheduling_service_AI;

/**
 * @author oyama
 * This class represents a single gene which will be a candidate within a chromosome
 */
public class Gene {
	String name;
	double value, weight;
	int parity; //A bit parity of 1 means its present in a chromosome otherwise its absent
	
	public Gene(String name2, double weight, double value) {
		this.name = name2;
		this.weight = weight;
		this.value = value;
		this.parity = (int) (Math.random()*2);
	}
	
	//For unit testing
	public Gene(String name2, double weight, double value, int parity) {
		this.name = name2;
		this.weight = weight;
		this.value = value;
		this.parity = parity;
	}
	
	public void flipBit() {
		if (this.parity == 1)
			this.parity = 0;
		else
			this.parity = 1;
	}
	
	public int getParity() {
		return parity;
	}
	public void setParity(int parity) {
		this.parity = parity;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Gene [name=" + name + ", value=" + value + ", weight=" + weight + ", parity=" + parity + "]";
	}
	
				
}
