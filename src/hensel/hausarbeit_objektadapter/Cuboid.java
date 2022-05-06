package hensel.hausarbeit_objektadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Cuboid: Stellt die Berechnungen für einen Quader dar
 *
 */

public class Cuboid extends Shape3D {
	
	private double width;
	private double height;
	private double depth;
	
	/**
	 * @param pointX : Koordinate x für die räumliche Bestimmung
	 * @param pointY : Koordinate y für die räumliche Bestimmung
	 * @param pointZ : Koordinate z für die räumliche Bestimmung
	 * @param height : Die Höhe des Quaders
	 * @param width : Die Breite des Quaders
	 * @param depth : Die Tiefe des Quaders
	 */
	public Cuboid(int pointX, int pointY, int pointZ, double width, double height, double depth) {
		super(pointX, pointY, pointZ);
		this.width = Math.abs(width);
		this.height = Math.abs(height);
		this.depth = Math.abs(depth);
	}
	
	/**
	 * @return Diagonale des Quaders
	 */
	// Berechnet die Diagonale des Quaders
	public double calcDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2) + Math.pow(depth, 2));
	}

	/**
	 * @return Seitenflächen des Quaders
	 */
	// Berechnet die Seitenflächen des Quaders
	public double[] calcAreas() {
		double xy = width * height;
		double yz = height * depth;
		double zx = depth * width;
		return new double[]{xy, yz, zx};
	}
	
	// Berechnet die Oberfläche eines Quaders
	@Override
	public double calcSurface() {
		double surface = 0;
		for (int i = 0; i < calcAreas().length; i++) {
			surface += calcAreas()[i];
		}
		return surface * 2;
	}
	
	// Berechnet das Volumen eines Quaders
	@Override
	public double calcVolume() {
		return width * height * depth;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getDepth() {
		return depth;
	}
	
	@Override
	public String toString() {
		return "Quader\n" +
			   "Position:         " + "x=" + getPointX() + " | y=" + getPointY() + " | z=" + getPointZ() + "\n" +
			   "Breite (absolut): " + getWidth() + "\n" +
	           "Höhe (absolut):   " + getHeight() + "\n" +
			   "Tiefe (absolut):  " + getDepth() + "\n" +
			   "Diagonale:        " + Math.round(Double.parseDouble(getDecimalPlace()) * calcDiagonal()) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Fläche xy:        " + Math.round(Double.parseDouble(getDecimalPlace()) * calcAreas()[0]) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Fläche yz:        " + Math.round(Double.parseDouble(getDecimalPlace()) * calcAreas()[1]) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Fläche zx:        " + Math.round(Double.parseDouble(getDecimalPlace()) * calcAreas()[2]) / Double.parseDouble(getDecimalPlace()) + "\n" +
		       "Oberfläche:       " + Math.round(Double.parseDouble(getDecimalPlace()) * calcSurface()) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Volumen:          " + Math.round(Double.parseDouble(getDecimalPlace()) * calcVolume()) / Double.parseDouble(getDecimalPlace()) + "\n\n";
	}
}
