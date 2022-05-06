package hensel.hausarbeit_objektadapter;

import java.math.BigDecimal;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Sphere_Adapter: Der Adapter für die Klasse Kugel eines Drittanbieters
 * 
 */

public class Sphere_Adapter extends Shape3D {

	private Kugel sphere;
	
	/**
	 * @param pointX : Koordinate x für die räumliche Bestimmung
	 * @param pointY : Koordinate y für die räumliche Bestimmung
	 * @param pointZ : Koordinate z für die räumliche Bestimmung
	 * @param radius : Der Radius für die Kugel
	 */
	public Sphere_Adapter(int pointX, int pointY, int pointZ, double radius) {
		super(pointX, pointY, pointZ);
		sphere = new Kugel(new BigDecimal(Math.abs(radius)));
	}
	
	@Override
	public double calcSurface() {
		return sphere.berechneOberfläche().doubleValue();
	}
	
	@Override
	public double calcVolume() {
		return sphere.berechneVolumen().doubleValue();
	}
	
	/**
	 * @return Durchmesser der Kugel
	 */
	public double calcDiameter() {
		return sphere.berechneDurchmesser().doubleValue();
	}
	
	/**
	 * @return Querschnitt der Kugel
	 */
	public double calcCrossSection() {
		return sphere.berechneQuerschnitt().doubleValue();
	}
	
	/**
	 * @return Umfang der Kugel
	 */
	public double calcScope() {
		return sphere.berechneUmfang().doubleValue();
	}
	
	public double getRadius() {
		return sphere.getRadius().doubleValue();
	}
	
	@Override
	public String toString() {
		return "Kugel\n" +
			   "Position:         " + "x=" + getPointX() + " | y=" + getPointY() + " | z=" + getPointZ() + "\n" +
			   "Radius (absolut): " + getRadius() + "\n" +
			   "Durchmesser:      " + Math.round(Double.parseDouble(getDecimalPlace()) * calcDiameter()) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Querschnitt:      " + Math.round(Double.parseDouble(getDecimalPlace()) * calcCrossSection()) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Umfang:           " + Math.round(Double.parseDouble(getDecimalPlace()) * calcScope()) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Oberfläche:       " + Math.round(Double.parseDouble(getDecimalPlace()) * calcSurface()) / Double.parseDouble(getDecimalPlace()) + "\n" +
			   "Volumen:          " + Math.round(Double.parseDouble(getDecimalPlace()) * calcVolume()) / Double.parseDouble(getDecimalPlace()) + "\n\n";
	}
}
