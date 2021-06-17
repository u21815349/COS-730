/**
 * 
 */
package scheduling_service_AI;

import java.util.ArrayList;

/**
 * @author oyama
 * An instance of this class represents a single chromosome composed of genes
 * randomly allocated
 */
public class Chromosome {
	
	//
	public ArrayList<Gene> genes = new ArrayList<>(); 
	int fitness; //based on how big the value of the sum of elements in the genes list.
	double totalWeight;
	
	//This will take the text file as input in order to extract the genes - gene creation args
	public Chromosome() {
	}	
	
	public int calculateFitness() {
		this.fitness = 0;
		for (Gene gene: genes)
			if (gene.parity == 1) //Test if this gene exists in this chromosome
				this.fitness += gene.value;
		return fitness;
	}
	
	public double calculateWeight() {
		this.totalWeight = 0;
		for (Gene gene: genes)
			if (gene.parity == 1) //Test if this gene exists in this chromosome
				this.totalWeight += gene.weight;
		return totalWeight;
	}
	
	public void mutate() { 
		int	mutationPoint = (int) (Math.random()*this.genes.size());
		this.genes.get(mutationPoint).flipBit();
		calculateWeight();
		calculateFitness();
		
	}

	@Override
	public String toString() {
		String str = "{";
		for (Gene gene: genes) {
			if (gene.getParity() == 1) {
				str += gene.name + ",";
			}
		}
		StringBuilder srtr = new StringBuilder();
		srtr.append(str);
		srtr.replace(srtr.length()-1, srtr.length(), "}");
		return srtr.toString() +  "\nFitness: " + this.calculateFitness() + "\nWeight: " + this.calculateWeight();
	}
}
