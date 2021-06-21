package scheduling_service_AI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GeneTest {

	
	@Test
	@DisplayName ("Must change value of bit to 1 if 0 and 0 if 1")
	void testFlipBit() {
		Gene gene = new Gene("iPhone 12", 23.4, 15200);
		int currentParity = gene.getParity();
		gene.flipBit();
		assertNotEquals(gene.getParity(),currentParity);	
	}
}
