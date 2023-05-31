package gr.upatras.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ComparatorTest {

	@Test
	void testCompare() {
		Comparator tester = new Comparator();
		assertEquals("POSITIVE", tester.compare(100, 50), "100 - 50 must be positive");
		assertEquals("NEGATIVE", tester.compare(50, 100), "50 - 100 must be negative");
		assertEquals("ZERO", tester.compare(100, 100), "100 - 100 must be zero");
	}

}
