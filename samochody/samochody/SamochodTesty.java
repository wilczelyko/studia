package samochody;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SamochodTesty {

	Samochod samochod;

	@Before
	public void testSamochod() {
		samochod = new Samochod("123456", 10000.0f, 10.0f,"Fiat126p");
	}

	@Test
	public void testGetRejestracja() {
		assertEquals("123456", samochod.getRejestracja());
	}
	
	@Test
	public void testGetMarka() {
		assertEquals("Fiat126p", samochod.getMarka());
	}

	@Test
	public void testAmortyzuj() {
		samochod.amortyzuj();
		assertEquals(9000.0f, samochod.getWartosc(),0.001f);
	}

	@Test
	public void testGetWartosc() {
		assertEquals(10000.0f, samochod.getWartosc(),0.001f);
	}

}
