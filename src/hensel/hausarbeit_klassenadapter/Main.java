package hensel.hausarbeit_klassenadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Main
 *
 */

public class Main {

	public static void main(String[] args) {
		// Erzeugung eines Canvas Objekts
		Canvas canvas = new Canvas();
		
		Shape3D sphere = new Sphere_Adapter(5, 3, 20, 20.8);
		Shape3D sphere2 = new Sphere_Adapter(17, 43, 12, 10.3);
		Shape3D cuboid = new Cuboid(3, 28, 35, 12.4, 1.5, 20.7);
		Shape3D cuboid2 = new Cuboid(7, 1, 2, 10.9322, 8.1, 1.7);
		// Erzeugung der konkreten Shape3D Objekte
		sphere2.setDecimalPlace(4);
		cuboid2.setDecimalPlace(4);
		// Einfügen in die Zeichenfläche
		canvas.addShape(sphere);
		canvas.addShape(sphere2);
		canvas.addShape(cuboid);
		canvas.addShape(cuboid2);
		
		// Konsolenausgabe für die Formen
		for (int i = 0; i < canvas.drawAllShapes().length; i++) {
			System.out.println("Form " + (i+1) + ": " + canvas.drawAllShapes()[i]);
		}
		System.out.println(canvas.drawSingleShape(4));
		
		System.out.println(canvas.calcTotalVolume());
		System.out.println(canvas.calcTotalSurface());
	}
}
