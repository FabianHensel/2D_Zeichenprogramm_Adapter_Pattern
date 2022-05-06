package hensel.hausarbeit_objektadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Canvas: Die Zeichenfläche für die 3D-Formen
 *
 */

public class Canvas {
	
	private Shape3D[] shapes;
	private int countShapes;
	
	public Canvas() {
		shapes = new Shape3D[10];
	}

	/**
	 * @param shape : Ein Objekt vom Typ Shape3D
	 */
	// Fügt maximal 10 Formen in das Array shapes ein
	public void addShape(Shape3D shape) {
		if (countShapes < 10) {
			shapes[countShapes] = shape;
			countShapes++;
		}
		else {
			System.out.println("Maximale Anzahl an Formen erreicht.");
		}
	}
	
	/**
	 * @param index : Die genaue Position der gewünschten Form, beginnt ab 1
	 * @return Die jeweilige Form oder bei nicht-vorhandenem Index == null
	 */
	// Zeichnet eine Form nach Wahl
	public Shape3D drawSingleShape(int index) {
		try {
			return shapes[index-1];
		}
		catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	/**
	 * @return Alle Formen
	 */
	// Zeichnet alle im Array shapes vorhandenen Formen
	public Shape3D[] drawAllShapes() {
		Shape3D[] drawShapes = new Shape3D[countShapes];
		for (int i = 0; i < countShapes; i++) {
			drawShapes[i] = shapes[i];
		}
		return drawShapes;
	}
	
	/**
	 * @return Das Gesamtvolumen aller Formen 
	 */
	// Berechnet das Gesamtvolumen aller Formen
	public double calcTotalVolume() {
		double totalVolume = 0;
		for (int i = 0; i < countShapes; i++) {
			totalVolume += shapes[i].calcVolume();
		}
		return totalVolume;
	}
	
	/**
	 * @return Die Gesamtoberfläche aller Formen 
	 */
	// Berechnet die Gesamtoberfläche aller Formen
	public double calcTotalSurface() {
		double totalSurface = 0;
		for (int i = 0; i < countShapes; i++) {
			totalSurface += shapes[i].calcSurface();
		}
		return totalSurface;
	}
}
