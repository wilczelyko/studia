package samochody;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KierowcaKontoTesty {

	Konto konto1;
	Konto konto2;
	
	@Before
	public void testKonto() {
		konto1 = new Konto(1000.0, "11");
		konto2 = new Konto(2000.0, "22");
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testWplac() {
		fail("Not yet implemented");
	}

	@Test
	public void testWyplac() {
		fail("Not yet implemented");
	}

	@Test
	public void testStanKonta() {
		fail("Not yet implemented");
	}

}
