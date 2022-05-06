package hensel.hausarbeit_klassenadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Cuboid: Stellt die Berechnungen f�r einen Quader dar
 *
 */

public class Cuboid implements Shape3D {
	
	private double width;
	private double height;
	private double depth;
	private int pointX;
	private int pointY;
	private int pointZ;
	// Zur Angabe der Nachkommastellen bei der Ausgabe der berechneten Werte
	private String decimalPlace;
	
	/**
	 * @param pointX : Koordinate x f�r die r�umliche Bestimmung
	 * @param pointY : Koordinate y f�r die r�umliche Bestimmung
	 * @param pointZ : Koordinate z f�r die r�umliche Bestimmung
	 * @param height : Die H�he des Quaders
	 * @param width : Die Breite des Quaders
	 * @param depth : Die Tiefe des Quaders
	 */
	public Cuboid(int pointX, int pointY, int pointZ, double width, double height, double depth) {
		this.width = Math.abs(width);
		this.height = Math.abs(height);
		this.depth = Math.abs(depth);
		this.pointX = pointX;
		this.pointY = pointY;
		this.pointZ = pointZ;
		// Als Standard sind zwei Nachkommastellen gegeben
		this.decimalPlace = "1" + new String(new char[2]).replace("\0", "0");
	}
	
	/**
	 * @return Diagonale des Quaders
	 */
	// Berechnet die Diagonale des Quaders
	public double calcDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2) + Math.pow(depth, 2));
	}

	/**
	 * @return Seitenfl�chen des Quaders
	 */
	// Berechnet die Seitenfl�chen des Quaders
	public double[] calcAreas() {
		double xy = width * height;
		double yz = height * depth;
		double zx = depth * width;
		return new double[]{xy, yz, zx};
	}
	
	// Berechnet die Oberfl�che eines Quaders
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
	
	// Zur Angabe der Nachkommastellen
	@Override
	public void setDecimalPlace(int decimalPlace) {
		if (decimalPlace > 1 && decimalPlace < 9) {
			this.decimalPlace = "1" + new String(new char[decimalPlace]).replace("\0", "0");
		}
		else {
			System.out.println("Keine zul�ssige Angabe. Standardausgabe wird verwendet.");
		}
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
		return "Quader\n" +
			   "Position:         " + "x=" + getPointX() + " | y=" + getPointY() + " | z=" + getPointZ() + "\n" +
			   "Breite (absolut): " + getWidth() + "\n" +
	           "H�he (absolut):   " + getHeight() + "\n" +
			   "Tiefe (absolut):  " + getDepth() + "\n" +
	           "Diagonale:        " + Math.round(Double.parseDouble(decimalPlace) * calcDiagonal()) / Double.parseDouble(decimalPlace) + "\n" +
			   "Fl�che xy:        " + Math.round(Double.parseDouble(decimalPlace) * calcAreas()[0]) / Double.parseDouble(decimalPlace) + "\n" +
			   "Fl�che yz:        " + Math.round(Double.parseDouble(decimalPlace) * calcAreas()[1]) / Double.parseDouble(decimalPlace) + "\n" +
			   "Fl�che zx:        " + Math.round(Double.parseDouble(decimalPlace) * calcAreas()[2]) / Double.parseDouble(decimalPlace) + "\n" +
		       "Oberfl�che:       " + Math.round(Double.parseDouble(decimalPlace) * calcSurface()) / Double.parseDouble(decimalPlace) + "\n" +
			   "Volumen:          " + Math.round(Double.parseDouble(decimalPlace) * calcVolume()) / Double.parseDouble(decimalPlace) + "\n\n";
	}
}
