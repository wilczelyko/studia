package samochody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Kierowca implements Serializable {

	private static final long serialVersionUID = 1L;
	private int pesel;
	private String imie;
	private String nazwisko;
	private String adres;
	private ArrayList<Samochod> samochody;
	private ArrayList<Konto> konta;
	
	public Kierowca(int pesel, String imie, String nazwisko, String adres) {
		this.pesel = pesel;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.samochody = new ArrayList<Samochod>();
	}

	public String getAdres() {return adres;}
	public int getPesel(){return pesel;}
	public Samochod znajdzSamochod(String rejestracja)
	{		 		   
		  for (Iterator<Samochod> it = samochody.iterator(); it.hasNext (); ) {
		    Samochod k = it.next();
		    if(k.getRejestracja()==rejestracja)
		    	return k;
		  }
		return null;
	}
	public String getImieINazwisko()
	{
		return imie+" "+ nazwisko;
	}
	public void amortyzujSamochody()
	{
		 for (Iterator<Samochod> it = samochody.iterator(); it.hasNext (); ) {
			    Samochod k = it.next();
			    k.amortyzuj();
		 }
	}	
	public void dodajSamochod(Samochod samochod)
	{
		samochody.add(samochod);
	}
	
	public void dodajKonto(Konto konto)
	{
		konta.add(konto);
	}
	
	public Konto znajdzKonto(String id)
	{
		for (Konto konto : konta)
		{
			if (konto.getId().equals(id))
				return konto;
		}
		return null;
	}
}
