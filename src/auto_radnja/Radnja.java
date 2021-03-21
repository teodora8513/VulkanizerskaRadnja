package auto_radnja;

import java.util.LinkedList;
import auto_radnja.gume.AutoGuma;
/**
 * Interfejs koji predstavlja radnju koja drzi gume
 * @author Teodora
 * @version 0.2
 */
public interface Radnja {
	/**
	 * Dodavanje gume a
	 * @param a A kao auto guma koja se dodaje
	 * 
	 */
	void dodajGumu(AutoGuma a);

	/**
	 * Pronalazi gumu odredjene marke
	 * @param markaModel Marka modela gume kao String
	 * @return Listu auto guma marke modela
	 */
	LinkedList<AutoGuma> pronadjiGumu(String markaModel);
}
