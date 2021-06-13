package scheduling_service_AI;

import java.util.ArrayList;

public class Output {
	
	ArrayList<Gene> solutionCrhomosome;
	double fitness, weight;
	int generation;
	public Output (ArrayList<Gene> solutionCrhomosome, double fitness, double weight, int generation) {
		this.solutionCrhomosome = solutionCrhomosome;
		this.fitness = fitness;
		this.weight = weight;
		this.generation = generation;
	}
	
	public Output() {
	}
}
