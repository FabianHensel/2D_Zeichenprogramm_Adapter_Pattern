package hensel.hausarbeit_klassenadapter;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * JUnit 5 Testklasse Sphere_AdapterTest
 * 
 */

public class Sphere_AdapterTest {

	Sphere_Adapter sphere = new Sphere_Adapter(4, -5, 6, -3.87);
	
	@Before
	public void before() {
		sphere.setDecimalPlace(8);
	}
	
	@Test
	public void testCalcSurface() {
		assertEquals(188.20527605, sphere.calcSurface(), 0.00000001);
	}
	
	@Test 
	public void testCalcVolume() {
		assertEquals(242.7848061, sphere.calcVolume(), 0.00000001);
	}
	
	@Test
	public void testCalcDiameter() {
		assertEquals(7.74, sphere.calcDiameter(), 0.00000001);
	}
	
	@Test
	public void testCalcCrossSection() {
		assertEquals(47.05131901, sphere.calcCrossSection(), 0.00000001);
	}
	
	@Test 
	public void testCalcScope() {
		assertEquals(24.31592713, sphere.calcScope(), 0.00000001);
	}
}
