package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

public abstract class RadnjaInterfaceTest {

	protected Radnja radnja;
	AutoGuma ag;
	@BeforeEach
	void setUp() throws Exception {
		ag = new AutoGuma("marka", 20,240,80);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testDodajGumu() {
		
		radnja.dodajGumu(ag);
		LinkedList<AutoGuma> gume = radnja.pronadjiGumu(ag.getMarkaModel());
		assertEquals(1, gume.size());
	}

	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class, ()-> radnja.dodajGumu(null));
	}
	
	@Test
	void testDodajGumuPostoji() {
		radnja.dodajGumu(ag);
		RuntimeException ex = assertThrows(java.lang.RuntimeException.class, ()-> radnja.dodajGumu(ag));
		assertEquals("Guma vec postoji", ex.getMessage());
	}
	
	@Test
	void testPronadjiGumu() {
		radnja.dodajGumu(ag);
		AutoGuma ag2 = new AutoGuma("marka", 23, 242, 88);
		radnja.dodajGumu(ag2);
		radnja.dodajGumu(new AutoGuma("marka3", 25, 243, 82));
		
		LinkedList<AutoGuma> result = radnja.pronadjiGumu("marka");
		assertTrue(result.size()==2);
		assertTrue(result.contains(ag));
		assertTrue(result.contains(ag2));
	}

}
