package scheduling_service_AI;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChromosomeTest {
	
	ArrayList<Gene> genes = new ArrayList<>();
	Chromosome chromosome = new Chromosome();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		chromosome.genes.add(new Gene("A", 1, 1, 1));
		chromosome.genes.add(new Gene("B", 2, 2, 0));
		chromosome.genes.add(new Gene("C", 3, 3, 1));
		chromosome.genes.add(new Gene("D", 4, 4, 1));
		chromosome.genes.add(new Gene("E", 5, 5, 0));
	}

	
	@Test
	@DisplayName ("Must only sum values of genes with a parity of 1")
	void testCalculateFitness() throws Exception {
		assertEquals(8,chromosome.calculateFitness());
	}

	@Test
	@DisplayName("Must only sum weight of genes with a parity of 1")
	void testCalculateWeight() {
		assertEquals(8,chromosome.calculateWeight());
	}

	@Test
	@DisplayName("The parity of exactly one gene must change")
	void testMutate() {
		boolean mutated = false;
		
		int [] paritiesCopy = new int[5];
		for (int i=0; i<5; i++) {
			paritiesCopy[i] = chromosome.genes.get(i).parity;
		}
		
		chromosome.mutate();
		for (int i=0; i<5; i++) {
			if( paritiesCopy[i] != chromosome.genes.get(i).parity) mutated = true;
		}
		
		assertTrue(mutated);
		
	}

}
