package auto_radnja.gume;

/**
 * Klasa koja predstavlja gume za automobil
 * 
 * @author Teodora
 * @version 0.1
 */
public class AutoGuma {

	/**
	 * Marka modela kao String inicijalizovana na null
	 */
	private String markaModel = null;
	/**
	 * Precnik gume kao int inicijalizovan na -1
	 */
	private int precnik = -1;
	/**
	 * Sirina gume kao int inicijalizovana na -1
	 */
	private int sirina = -1;
	/**
	 * Visina gume kao int inicijalizovana na -1
	 */
	private int visina = -1;

	/**
	 * Neparametarski konstruktor
	 */
	public AutoGuma() {
	}
	/**
	 * 
	 * @param markaModel Marka modela kao String
	 * @param precnik Precnik gume kao int
	 * @param sirina Sirina gume kao int
	 * @param visina Visina gume kao int
	 * 
	 * Parametarski konstruktor koji vrsi inicijalizaciju na postavljene vrednosti
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	/**
	 * Vraca marku modela
	 * @return Marku modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length() < 3)
			throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik
	 * @return Precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja precnik kako novu vrednost
	 * @param precnik precnik kao int
	 * @throws java.lang.RuntimeException ako je uneti precnik van opsega
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume
	 * @return Sirinu kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja sirinu kao novu vrednosti
	 * @param sirina sirna kao int
	 * @throws java.lang.RuntimeException ako je sirina van opsega
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu 
	 * @return Visinu kao int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja sirinu na novu vrednost
	 * @param visina visina kao int
	 * @throws java.lang.RuntimeException ako je visina van opsega
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca String o svim podacima o auto gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi dve auto gume i vraca true ako su iste i false ako nisu.
	 * Auto gume se porede po marki modela, precniku, sirini i visini.
	 * @return
	 * <ul>
	 * <li>true ako su oba objekta klase AutoGuma iste</li>
	 * <li>false u ostalim slucajevima</li>
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
