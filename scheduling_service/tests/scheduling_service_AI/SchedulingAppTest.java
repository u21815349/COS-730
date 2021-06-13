package scheduling_service_AI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import scheduling_service.ParcelObject;
import scheduling_service.ParcelSet;

class SchedulingAppTest {
	
	ParcelSet parcelSet;
	SchedulingApp app;

	@BeforeEach
	void setUp() throws Exception {
		parcelSet = new ParcelSet(3,10,(long) 3);
		parcelSet.parcels.add(new ParcelObject("A", 1.1, 5));
		parcelSet.parcels.add(new ParcelObject("B", 2.1, 10));
		parcelSet.parcels.add(new ParcelObject("C", 3.1, 15));
	}

	@Test
	@DisplayName ("Should return fitness not less than 10; capacity not more than 3")
	void testSortParcels() {
		double fitness = (new SchedulingApp()).SortParcels(parcelSet).fitness;
		double weight = (new SchedulingApp()).SortParcels(parcelSet).weight;
		assertTrue(fitness >= 10);
		assertTrue(weight < 3);
	}

}
