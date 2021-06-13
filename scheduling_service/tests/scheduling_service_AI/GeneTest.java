package scheduling_service_AI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneTest {

	
	@Test
	void testFlipBit() {
		Gene gene = new Gene("iPhone 12", 23.4, 15200);
		int currentParity = gene.getParity();
		gene.flipBit();
		assertNotEquals(gene.getParity(),currentParity);	
	}
}
