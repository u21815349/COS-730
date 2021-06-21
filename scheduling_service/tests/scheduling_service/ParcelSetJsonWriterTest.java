package scheduling_service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import scheduling_service_AI.Output;

class ParcelSetJsonWriterTest {
	
	static Output output;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ArrayList<String> sortedParcels = new ArrayList<>();
		sortedParcels.add("A");
		sortedParcels.add("B");
		sortedParcels.add("C");
		output = new Output(sortedParcels, 5.0,5.0, 3);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@DisplayName ("Must write to the output file.")
	void test() {
		ParcelSetJsonWriter writer = new ParcelSetJsonWriter();
		//writer.write(output);
		assertEquals(0,writer.write(output));
	}

}
