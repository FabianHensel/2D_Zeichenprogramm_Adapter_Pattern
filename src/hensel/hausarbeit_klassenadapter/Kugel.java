package hensel.hausarbeit_klassenadapter;

import java.math.BigDecimal;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Klasse Kugel: Stellt die Berechnungen für eine Kugel dar; Ist in diesem Szenario von einem Drittanbieter
 *
 */

public class Kugel {
	
	private BigDecimal radius;
	
	public Kugel(BigDecimal radius) {
		this.radius = radius;
	}
	
	// Berechnet den Durchmesser der Kugel
	public BigDecimal berechneDurchmesser() {
		return radius.multiply(new BigDecimal(2));
	}
	
	// Berechnet den Umfang der Kugel
	public BigDecimal berechneUmfang() {
		return new BigDecimal(Math.PI).multiply(berechneDurchmesser());
	}
	
	// Berechnet die Querschnittsfläche der Kugel
	public BigDecimal berechneQuerschnitt() {
		return new BigDecimal(Math.PI).multiply(radius.pow(2));
	}
	
	// Berechnet das Volumen der Kugel
	public BigDecimal berechneVolumen() {
		return new BigDecimal(4/3d).multiply(new BigDecimal(Math.PI).multiply(radius.pow(3)));
	}
	
	// Berechnet die Oberfläche der Kugel
	public BigDecimal berechneOberfläche() {
		return new BigDecimal(4).multiply(new BigDecimal(Math.PI).multiply(radius.pow(2)));
	}
	
	public BigDecimal getRadius() {
		return radius;
	}
}
