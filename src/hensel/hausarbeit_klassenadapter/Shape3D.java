package hensel.hausarbeit_klassenadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Interface Shape3D: Das Interface für die 3D-Formen
 *
 */

public interface Shape3D {
	
	// Oberfläche und Volumen sind bei jeder Form gegeben 
	
	/**
	 * @return Oberfläche der jeweiligen Form
	 */
	public double calcSurface();
	
	/**
	 * @return Volumen der jeweiligen Form
	 */
	public double calcVolume();
	
	/**
	 * @param decimalPlace : Die genaue Nachkommastelle
	 */
	public void setDecimalPlace(int decimalPlace);
}
