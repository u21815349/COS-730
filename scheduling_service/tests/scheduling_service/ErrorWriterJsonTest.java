package scheduling_service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ErrorWriterJsonTest {

	static ErrorWriterJson errorWr = new ErrorWriterJson();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@DisplayName ("Must write error in json format to the output file.")
	void test() {
		assertEquals(0,errorWr.noSolutionForConstraints());
	}

}
