/**
 * 
 */
package scheduling_service_AI;

import java.util.*;

import scheduling_service.ParcelSet;



/**
 * @author oyama
 *
 */
public class SchedulingApp {
	
	public SchedulingApp() {};
	
	public Output SortParcels (ParcelSet parcelSet) {
		ArrayList<Chromosome> chromosomes = new  ArrayList<>();
	
		Population population = new Population(parcelSet.getCapacity(), parcelSet.getQuota(), parcelSet.getNumberOfParcels());
		
		//Initialize the first chromosome of a population.
		//The rest will be derived from this one.
		Chromosome chromosome = new Chromosome();
		for (int i = 0; i< parcelSet.getNumberOfParcels(); i++) {
			Gene gene1 = new Gene(parcelSet.parcels.get(i).getName(),
					parcelSet.parcels.get(i).getWeight(),parcelSet.parcels.get(i).getValue());
			
			chromosome.genes.add(gene1);
		}
		
		chromosomes.add(chromosome);//Just a scaffold
		population.chromosomes.add(chromosome);
		
		
		int populationCount = 1;
		
		int generationCount = 0;
		population.initializePopulation();
		while(population.checkGoal() != true) {
			population.selection();
			population.FullCrossOver();
			population.mutate();
			//population.checkGoal();
			generationCount++;
			if (generationCount == 20000)
				System.out.println("Please wait...");
			if (generationCount == 40000)
				System.out.println("Please wait...");
			if (generationCount == 50000) 
				break;
		}
		
		if (population.solutionChromosome == null) {
			System.out.println("No solution for problem: " + populationCount + " over 50000 generations");
			System.out.println("===========================");
			return null;
		}
		else
		{
			System.out.println("Solution\n" + population.solutionChromosome + 
					" \nGeneration: " + generationCount + "\n===============================");
			ArrayList<String> solutionListNames = new ArrayList<>();
			for (Gene gene : population.solutionChromosome.genes) {
				if (gene.getParity() == 1) {
					solutionListNames.add(gene.name);
				}
			}
			
			return (new Output(solutionListNames, population.solutionChromosome.fitness,
					population.solutionChromosome.totalWeight,generationCount));
		}	
	}
}