package scheduling_service_AI;

import java.util.ArrayList;

public class Output {
	
	ArrayList<String> solutionChromosome;
	double fitness, weight;
	int generation;
	public Output (ArrayList<String> solutionCrhomosome, double fitness, double weight, int generation) {
		this.solutionChromosome = solutionCrhomosome;
		this.fitness = fitness;
		this.weight = weight;
		this.generation = generation;
	}
	
	public Output() {
	}

	public ArrayList<String> getSolutionCrhomosome() {
		return solutionChromosome;
	}

	public void setSolutionCrhomosome(ArrayList<String> solutionChromosome) {
		this.solutionChromosome = solutionChromosome;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
