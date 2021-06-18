/**
 * 
 */
package scheduling_service_AI;

import java.util.ArrayList;

/**
 * @author oyama
 * An instance of this class represents a group of chromosomes making up a population.
 */
public class Population {
	
	Chromosome solutionChromosome; 
	double capacity, quota;
	int numOfBoxes;
	public ArrayList<Chromosome> chromosomes = new ArrayList<>();
	
	public Population(double capacity, double quota, int i) {
		this.capacity = capacity;
		this.quota = quota;
		this.numOfBoxes = i;
	
	}
	
	public void initializePopulation() {
		
		while (chromosomes.size() < 50) {
			Chromosome chromosome = new Chromosome();
			for (Gene gene: chromosomes.get(0).genes) {
				Gene tempGene = new Gene(gene.name, gene.weight, gene.value);
				chromosome.genes.add(tempGene);	
			}
			
			chromosome.calculateWeight();
			chromosome.calculateFitness();
			chromosomes.add(chromosome);
		}
	}
	
	private ArrayList<Chromosome> crossOver(Chromosome parent_1, Chromosome parent_2) {
		ArrayList<Chromosome> children = new ArrayList<>();
		Chromosome child_1 = new Chromosome();
		Chromosome child_2 = new Chromosome();
		int crossPoint = (int) (Math.random()*parent_1.genes.size()-1);//Restricting the cross point to 2 less than the size of the chromosome.
			
			
		for (int index = 0; index < crossPoint; index++) //Load child one from parent one index 0 up to the crossover point
			child_1.genes.add(parent_1.genes.get(index));
			
		for (int index = crossPoint; index < parent_2.genes.size(); index++ )//Load the second half of child one from the crossPoint up to the end of parent 2
			child_1.genes.add(parent_2.genes.get(index));
			
		for (int index = 0; index < crossPoint; index++) //Load child two from parent two index 0 up to the crossover point
			child_2.genes.add(parent_2.genes.get(index));
		
		for (int index = crossPoint; index < parent_1.genes.size(); index++) //Load the second half of child two from the crossPoint up to the end of parent one
			child_2.genes.add(parent_1.genes.get(index));
			
		child_1.calculateWeight();
		child_1.calculateFitness();
		child_2.calculateWeight();
		child_2.calculateFitness();
			
			
		children.add(child_1);
		children.add(child_2);
				
		return children;
	}
	
	public void FullCrossOver(){
		ArrayList<Chromosome> fittestList = selection();
		int parentOneIndex = 0;
		int parentTwoIndex = 1;
		for (int i = 0; i < (int)(fittestList.size()/2); i++) { //crossing chromosomes e.g 1&2 , 3&4 etc
			int crossOverRate = (int)(Math.random()*100);
			if (crossOverRate < 90) { //Cross over rate of 80%
				ArrayList<Chromosome> cross = crossOver(chromosomes.get(parentOneIndex),chromosomes.get(parentTwoIndex));
				chromosomes.set(parentOneIndex, cross.get(0));
				chromosomes.set(parentTwoIndex, cross.get(1));
			}
			parentOneIndex+=2;
			parentTwoIndex+=2;
		}
	}
	
	//Takes this array of chromosomes and performs a tournament selection
	public ArrayList<Chromosome> selection(){
		ArrayList<Chromosome> fittestList = new ArrayList<>();
		//Selecting the fittest parents equivalent to the size of this population
		for (int j = 0; j < this.chromosomes.size(); j++) {
			ArrayList<Chromosome> tournamentCandidates = new ArrayList<>();
			//Choose a third of the population to participate in the tournament.
			for(int i = 0; i < (int)(this.chromosomes.size()/3);i++) { 
				int chromosomeIndex =  (int) (Math.random()*this.chromosomes.size()); //select a chromosome randomly
				tournamentCandidates.add(this.chromosomes.get(chromosomeIndex));
			}
		
			//Get the fittest in the tournament
			Chromosome fittest = tournamentCandidates.get(0);
			
			for (Chromosome chromosome: tournamentCandidates) {
				if (chromosome.calculateFitness() > fittest.calculateFitness()) {
					fittest = chromosome;
				}
			}
			fittestList.add(fittest);
		}
		return fittestList;
	}
		
	public void mutate() {
		for (Chromosome chromosome: chromosomes) {
			int mutationRate = (int)(Math.random()*100);
			if (mutationRate < 5) //mutation rate of 5%
				chromosome.mutate();
		}
	}
	
	public boolean checkGoal() {
		for (Chromosome chromosome: this.chromosomes) {
			if (chromosome.calculateFitness() >= quota && chromosome.calculateWeight() <= this.capacity) {
				solutionChromosome = chromosome;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "";
		for (Chromosome chromosome: chromosomes)
			str += chromosome.toString() + "\n";
		return "Population\n==========================================\n"+ str;
	}	
}
