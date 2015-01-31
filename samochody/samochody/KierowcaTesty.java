package samochody;
import org.junit.Test;
import org.junit.Before;
import static org.easymock.classextension.EasyMock.*;
import static org.junit.Assert.*;

public class KierowcaTesty {
	
	Kierowca kierowca;
	Samochod mockSamochod;
	Samochod mockSamochod1;
	
	
	@Before
	public void inicjujTesty()
	{
		kierowca = new Kierowca(3843, "John", "Doe", "5th Str, Langley");
		mockSamochod = createMock(Samochod.class);
		mockSamochod1 = createMock(Samochod.class);
	}
	
	@Test
	public void testDaneKierowcy()
	{
		assertEquals(kierowca.getImieINazwisko(),"John Doe");
	}
	
	@Test
	public void testGetPesel()
	{
		assertEquals(3843, kierowca.getPesel());
	}
	
	@Test
	public void testGetAdres()
	{
		assertEquals("5th Str, Langley", kierowca.getAdres());
	}
	
	@Test
	public void testZnajdzSamochodJeden()
	{
		expect(mockSamochod.getRejestracja()).andReturn("1111");
		replay(mockSamochod);
		kierowca.dodajSamochod(mockSamochod);
		assertEquals(mockSamochod, kierowca.znajdzSamochod("1111"));
	}
	
	@Test
	public void testZnajdzSamochodZero()
	{
		assertEquals(null, kierowca.znajdzSamochod("1111"));
	}
	
	@Test
	public void testZnajdzSamochodWiecej()
	{
		expect(mockSamochod.getRejestracja()).andReturn("1111");
		expect(mockSamochod1.getRejestracja()).andReturn("2222");
		replay(mockSamochod);
		replay(mockSamochod1);
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod1);
		assertEquals(mockSamochod1, kierowca.znajdzSamochod("2222"));
	}
	
	@Test
	public void testZnajdzSamochodNieZnaleziono()
	{
		expect(mockSamochod.getRejestracja()).andReturn("1111");
		replay(mockSamochod);
		kierowca.dodajSamochod(mockSamochod);
		assertEquals(null, kierowca.znajdzSamochod("2222"));
	}
	
	@Test
	public void testAmortyzujSamochodyZero()
	{
		kierowca.amortyzujSamochody();
	}
	
	@Test
	public void testAmortyzujSamochodyJeden()
	{
		mockSamochod.amortyzuj();
		replay(mockSamochod);
		kierowca.dodajSamochod(mockSamochod);
		kierowca.amortyzujSamochody();
	}
	
	@Test
	public void testAmortyzujSamochodyWiele()
	{
		mockSamochod.amortyzuj();
		mockSamochod1.amortyzuj();
		replay(mockSamochod);
		replay(mockSamochod1);
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod1);
		kierowca.amortyzujSamochody();
	}
}