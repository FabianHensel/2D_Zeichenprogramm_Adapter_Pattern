package hensel.hausarbeit_objektadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Shape3D: Die abstrakte Oberklasse f�r alle 3D-Formen
 *
 */

public abstract class Shape3D {
	
	private int pointX;
	private int pointY;
	private int pointZ;
	private String decimalPlace;
	
	/**
	 * @param pointX : Koordinate x f�r die r�umliche Bestimmung
	 * @param pointY : Koordinate y f�r die r�umliche Bestimmung
	 * @param pointZ : Koordinate z f�r die r�umliche Bestimmung
	 */
	public Shape3D(int pointX, int pointY, int pointZ) {
		this.pointX = pointX;
		this.pointY = pointY;
		this.pointZ = pointZ;
		// Als Standard sind zwei Nachkommastellen gegeben
		this.decimalPlace = "1" + new String(new char[2]).replace("\0", "0");
	}
	
	/**
	 * @return Oberfl�che der jeweiligen Form
	 */
	// Oberfl�che und Volumen sind bei jeder Form gegeben
	public abstract double calcSurface();
	
	/**
	 * @return Volumen der jeweiligen Form
	 */
	public abstract double calcVolume();
	
	/**
	 * @param decimalPlace : Die genaue Nachkommastelle
	 */
	// Zur Angabe der Nachkommastellen
	public void setDecimalPlace(int decimalPlace) {
		if (decimalPlace > 1 && decimalPlace < 9) {
			this.decimalPlace = "1" + new String(new char[decimalPlace]).replace("\0", "0");
		}
		else {
			System.out.println("Keine zul�ssige Angabe. Standardausgabe wird verwendet.");
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
	
	public String getDecimalPlace() {
		return decimalPlace;
	}
}
