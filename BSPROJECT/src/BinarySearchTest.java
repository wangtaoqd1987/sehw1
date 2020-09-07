import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

	private static BinarySearch bs = new BinarySearch();
	
	@BeforeEach
	void setUp() throws Exception {
		bs.data.add(2);
		bs.data.add(3);
		bs.data.add(4);
		bs.data.add(5);
		bs.data.add(9);
	}

	@Test
	void testBSearch() {
		assertEquals(3, bs.bSearch(5));
	}
	
	@Test
	void testBSearchLowIndex() {
		assertEquals(0, bs.bSearch(2));
	}
	
	@Test
	void testBSearchMiddle() {
		assertEquals(2, bs.bSearch(4));
	}

}
