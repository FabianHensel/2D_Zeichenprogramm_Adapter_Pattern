package hensel.hausarbeit_objektadapter;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * JUnit 5 Testklasse CuboidTest
 *
 */

public class CuboidTest {
	
	Cuboid cuboid = new Cuboid(-2, -7, 6, 3.35, -5.54, 7.76);

	@Before
	public void before() {
		cuboid.setDecimalPlace(8);
	}
	
	@Test
	public void testCalcDiagonal() {
		assertEquals(10.10602295, cuboid.calcDiagonal(), 0.00000001);
	}
	
	@Test
	public void testCalcAreas() {
		assertEquals(18.559, cuboid.calcAreas()[0], 0.00000001);
		assertEquals(42.9904, cuboid.calcAreas()[1], 0.00000001);
		assertEquals(25.996, cuboid.calcAreas()[2], 0.00000001);
	}
	
	@Test
	public void testCalcSurface() {
		assertEquals(175.0908, cuboid.calcSurface(), 0.00000001);
	}
	
	@Test
	public void testCalcVolume() {
		assertEquals(144.01784, cuboid.calcVolume(), 0.00000001);
	}
}
