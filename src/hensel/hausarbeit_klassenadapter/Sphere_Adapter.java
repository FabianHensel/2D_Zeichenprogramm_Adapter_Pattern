package hensel.hausarbeit_klassenadapter;

import java.math.BigDecimal;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Sphere_Adapter: Der Adapter für die Klasse Kugel eines Drittanbieters
 * 
 */

public class Sphere_Adapter extends Kugel implements Shape3D {

	private int pointX;
	private int pointY;
	private int pointZ;
	// Zur Angabe der Nachkommastellen bei der Ausgabe der berechneten Werte
	private String decimalPlace;
	
	/**
	 * @param pointX : Koordinate x für die räumliche Bestimmung
	 * @param pointY : Koordinate y für die räumliche Bestimmung
	 * @param pointZ : Koordinate z für die räumliche Bestimmung
	 * @param radius : Der Radius für die Kugel
	 */
	public Sphere_Adapter(int pointX, int pointY, int pointZ, double radius) {
		super(new BigDecimal(Math.abs(radius)));
		this.pointX = pointX;
		this.pointY = pointY;
		this.pointZ = pointZ;
		// Als Standard sind zwei Nachkommastellen gegeben 
		this.decimalPlace = "1" + new String(new char[2]).replace("\0", "0");
	}
	
	@Override
	public double calcSurface() {
		return berechneOberfläche().doubleValue();
	}
	
	@Override
	public double calcVolume() {
		return berechneVolumen().doubleValue();
	}
	
	/**
	 * @return Durchmesser der Kugel
	 */
	public double calcDiameter() {
		return berechneDurchmesser().doubleValue();
	}
	
	/**
	 * @return Querschnitt der Kugel
	 */
	public double calcCrossSection() {
		return berechneQuerschnitt().doubleValue();
	}
	
	/**
	 * @return Umfang der Kugel
	 */
	public double calcScope() {
		return berechneUmfang().doubleValue();
	}
	
	// Zur Angabe der Nachkommastellen
	public void setDecimalPlace(int decimalPlace) {
		if (decimalPlace > 1 && decimalPlace < 9) {
			this.decimalPlace = "1" + new String(new char[decimalPlace]).replace("\0", "0");
		}
		else {
			System.out.println("Keine zulässige Angabe. Standardausgabe wird verwendet.");
		}
	}
	
	public int getPointX() {
		return pointX;
	}
	
	public int getPointY() {
		return pointY;
	}
	
	public int getPointZ() {
		return pointZ;
	}
	
	@Override
	public String toString() {
		return "Kugel\n" +
			   "Position:         " + "x=" + getPointX() + " | y=" + getPointY() + " | z=" + getPointZ() + "\n" +
			   "Radius (absolut): " + getRadius().doubleValue() + "\n" +
			   "Durchmesser:      " + Math.round(Double.parseDouble(decimalPlace) * calcDiameter()) / Double.parseDouble(decimalPlace) + "\n" +
			   "Querschnitt:      " + Math.round(Double.parseDouble(decimalPlace) * calcCrossSection()) / Double.parseDouble(decimalPlace) + "\n" +
			   "Umfang:           " + Math.round(Double.parseDouble(decimalPlace) * calcScope()) / Double.parseDouble(decimalPlace) + "\n" +
			   "Oberfläche:       " + Math.round(Double.parseDouble(decimalPlace) * calcSurface()) / Double.parseDouble(decimalPlace) + "\n" +
			   "Volumen:          " + Math.round(Double.parseDouble(decimalPlace) * calcVolume()) / Double.parseDouble(decimalPlace) + "\n\n";
	}
}
