package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class AutoGumaTest {

	AutoGuma ag;

	@BeforeEach
	void setUp() throws Exception {
		ag = new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		ag = null;
	}

	@Test
	void testAutoGuma() {
		ag = new AutoGuma();
		assertNotNull(ag);
	}

	@Test
	void testAutoGumaStringIntIntInt() {
		ag = new AutoGuma("marka", 20, 220, 80);
		assertEquals("marka", ag.getMarkaModel());
		assertEquals(10, ag.getPrecnik());
		assertEquals(20, ag.getSirina());
		assertEquals(30, ag.getVisina());

	}

	@Test
	void testSetMarkaModel() {
		ag.setMarkaModel("Zebra");
		assertEquals("Zebra", ag.getMarkaModel());
	}

	@Test
	@DisplayName("Testira da li je uneta marka null")
	void testSetMarkaModelNull() {
		assertThrows(java.lang.NullPointerException.class, () -> ag.setMarkaModel(null));
	}

	@Test
	@DisplayName("Testira da li je uneta marka kraca od 3 karaktera")
	void testSetMarkaModelNaziv() {

		assertThrows(java.lang.RuntimeException.class, () -> ag.setMarkaModel("ad"));
	}

	
	@ParameterizedTest
	@CsvSource({
		"21, true",
		"15, true",
		"22, true",
	})
	void testSetPrecnik(int precnik) {
		ag.setPrecnik(precnik);
		assertEquals(precnik, ag.getPrecnik());
	}

	@ParameterizedTest
	@CsvSource({
		"210, true",
		"230, true",
		"220, true",
	})
	void testSetSirina(int sirina) {
		ag.setSirina(sirina);
		assertEquals(sirina, ag.getSirina());
	}

	@ParameterizedTest
	@CsvSource({
		"60, true",
		"70, true",
		"80, true",
	})
	void testSetVisina(int visina) {
		ag.setVisina(visina);
		assertEquals(visina, ag.getVisina());
	}

	@Test
	void testToString() {
		ag = new AutoGuma("marka", 20, 220, 80);
		String s = ag.toString();
		assertTrue(s.contains("marka"));
		assertTrue(s.contains("20"));
		assertTrue(s.contains("220"));
		assertTrue(s.contains("80"));
	}

	@ParameterizedTest
	@CsvSource({ "marka, marka,20,20,240, 240,80, 80, true",
		"marka1, marka,20,20,240, 240,80, 80, false",
		"marka, marka,21,20,240, 240,80, 80, false",
		"marka, marka,20,20,220, 240,80, 80, false",
		"marka, marka,20,20,240, 240,85, 80, false",})
	@DisplayName("Testiranje equals metode")
	void testEqualsObject(String marka1, String marka2, int precnik1, int precnik2, int sirina1, int sirina2, 
			int visina1, int visina2) {
		ag = new AutoGuma(marka1, precnik1, sirina1, visina1);
		AutoGuma ag1 = new AutoGuma(marka2, precnik2, sirina2, visina2);

		assertTrue(ag.equals(ag1));
	}

}
