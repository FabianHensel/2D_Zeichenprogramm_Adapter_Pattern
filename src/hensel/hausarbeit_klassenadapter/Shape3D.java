package hensel.hausarbeit_klassenadapter;

/**
 * 
 * @author Fabian Hensel
 * @since 24.02.2021
 * Interface Shape3D: Das Interface f�r die 3D-Formen
 *
 */

public interface Shape3D {
	
	// Oberfl�che und Volumen sind bei jeder Form gegeben 
	
	/**
	 * @return Oberfl�che der jeweiligen Form
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
