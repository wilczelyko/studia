package samochody;

import java.io.Serializable;

public class Samochod implements Serializable{
	private static final long serialVersionUID = 8931683992792155999L;
	private String rejestracja;
	private float wartosc;
	private float amortyzacja;
	private String marka;
	
	public Samochod(String rejestracja, float wartosc, float amortyzacja, String marka)
	{
		this.rejestracja=rejestracja;
		this.wartosc=wartosc;
		this.amortyzacja=amortyzacja;
		this.marka = marka;
	}
	
	public String getMarka() {return marka;}

	public String getRejestracja()
	{
		int i = 1;
		return rejestracja;
	}
	public void amortyzuj()
	{
		this.wartosc-=this.wartosc*this.amortyzacja/100.0;
	}
	public float getWartosc()
	{
		return this.wartosc;
	}
	
}
