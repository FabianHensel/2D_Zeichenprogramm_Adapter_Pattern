package hensel.hausarbeit_objektadapter;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * JUnit 5 Testklasse CanvasTest
 *
 */

public class CanvasTest {

	Canvas canvas = new Canvas();
	
	Shape3D cuboid1 = new Cuboid(1, 2, 3, 4, -5, 6);
	Shape3D cuboid2 = new Cuboid(2, 3, 4, 5, 6, -7);
	Shape3D cuboid3 = new Cuboid(3, 4, 5, -6, 7, 8);
	Shape3D cuboid4 = new Cuboid(4, 5, 6, 7, 8, -9);
	Shape3D cuboid5 = new Cuboid(5, 6, 7, -8, 9, 10);
	
	Shape3D sphere1 = new Sphere_Adapter(1, 2, 3, -1);
	Shape3D sphere2 = new Sphere_Adapter(1, 2, 3, 2);
	Shape3D sphere3 = new Sphere_Adapter(1, 2, 3, -3);
	Shape3D sphere4 = new Sphere_Adapter(1, 2, 3, 4);
	Shape3D sphere5 = new Sphere_Adapter(1, 2, 3, -5);
	
	Shape3D shape11 = new Sphere_Adapter(1, 2, 3, 6);
	
	@Before
	public void before() {
		canvas.addShape(cuboid1);
		canvas.addShape(cuboid2);
		canvas.addShape(cuboid3);
		canvas.addShape(cuboid4);
		canvas.addShape(cuboid5);
		
		canvas.addShape(sphere1);
		canvas.addShape(sphere2);
		canvas.addShape(sphere3);
		canvas.addShape(sphere4);
		canvas.addShape(sphere5);
	}
	
	@Test 
	public void testAddShape() {
		canvas.addShape(shape11); // Konsolenausgabe muss erfolgen
	}
	
	@Test
	public void testDrawSingleShape() {
		assertSame(cuboid3, canvas.drawSingleShape(3));
		assertSame(null, canvas.drawSingleShape(-1));
	}
	
	@Test
	public void testDrawAllShapes() {
		assertSame(cuboid1, canvas.drawAllShapes()[0]);
		assertSame(cuboid5, canvas.drawAllShapes()[4]);
		assertSame(sphere1, canvas.drawAllShapes()[5]);
		assertSame(sphere5, canvas.drawAllShapes()[9]);
	}
	
	@Test
	public void testCalcTotalVolume() {
		assertEquals(2832.47779607, canvas.calcTotalVolume(), 0.00000001);
	}
	
	@Test
	public void testCalcTotalSurface() {
		assertEquals(2211.15038378, canvas.calcTotalSurface(), 0.00000001);
	}
}
