package auto_radnja;

import java.util.LinkedList;
import auto_radnja.gume.AutoGuma;
/**
 * Klasa VulkanizerskaRadnja implementira interfejs Radnja
 * @author Teodora
 * @version 0.2
 *
 */
public class VulkanizerskaRadnja implements Radnja {
	/**
	 * Lista raspolozivih guma u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	@Override
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	@Override
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
