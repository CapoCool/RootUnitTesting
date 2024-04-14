import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RootsTest {
	Roots root = new Roots();
	private static final double DELTA = 1e-15;
	
	@Test
	public void testID1() {
		root.calculate_roots(1, 5, 5);
		assertEquals(2.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID2() {
		root.calculate_roots(9, 5, 5);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID3() {
		root.calculate_roots(10, 5, 5);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID4() {
		root.calculate_roots(5, 0, 5);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID5() {
		root.calculate_roots(5, 1, 5);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID6() {
		root.calculate_roots(5, 9, 5);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID7() {
		root.calculate_roots(5, 10, 5);
		assertEquals(1.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID8() {
		root.calculate_roots(5, 5, 0);
		assertEquals(2.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID9() {
		root.calculate_roots(5, 5, 1);
		assertEquals(2.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID10() {
		root.calculate_roots(5, 5, 9);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID11() {
		root.calculate_roots(5, 5, 10);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	@Test
	public void testID12() {
		root.calculate_roots(5, 5, 5);
		assertEquals(0.00, root.num_roots, DELTA);
	}
	
	
}

