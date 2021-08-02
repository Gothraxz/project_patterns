package plant;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BushTest {

	Bush bush = new Bush();
	int maxGramsPerPackage = bush.getGramPerPackage();
	
	@Test
	void shouldShowIfPlantIsEdible() {
		
		assertFalse(bush.isEdible());
		
	}
	
	@Test
	void shouldHaveGramsPerPackageGreatrThanZero() {
		
		assertTrue(maxGramsPerPackage > 0);
		
	}

	@Test
	void shouldCountZeroPackages() {

		int grams = 0;
		int expectedPackagesCount = 0;

		int calculatedNumberOfPackages = bush.countNumberOfPackage(grams);

		assertEquals(expectedPackagesCount, calculatedNumberOfPackages);

	}
	
	@Test
	void shouldCountZeroPackagesWithGramsLessThanZero() {

		int grams = 0 - maxGramsPerPackage;
		int expectedPackagesCount = 0;

		int calculatedNumberOfPackages = bush.countNumberOfPackage(grams);

		assertEquals(expectedPackagesCount, calculatedNumberOfPackages);

	}

	@Test
	void shouldCountOneFullPackage() {

		int grams = maxGramsPerPackage;
		int expectedPackagesCount = 1;

		int calculatedNumberOfPackages = bush.countNumberOfPackage(grams);

		assertEquals(expectedPackagesCount, calculatedNumberOfPackages);

	}

	@Test
	void shouldCountOneNotFullPackage() {

		int grams = maxGramsPerPackage - 1;
		int expectedPackagesCount = 1;

		int calculatedNumberOfPackages = bush.countNumberOfPackage(grams);

		assertEquals(expectedPackagesCount, calculatedNumberOfPackages);

	}

	@Test
	void shouldCountTwoPackages() {

		int grams = maxGramsPerPackage + 1;
		int expectedPackagesCount = 2;

		int calculatedNumberOfPackages = bush.countNumberOfPackage(grams);

		assertEquals(expectedPackagesCount, calculatedNumberOfPackages);

	}
	
}
