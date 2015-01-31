package automat;

//napisaæ tak¹ implementacjê, w której metody przyjmij monetê, wydaj puszkê, zwróæ monetê przyjmuj¹ w paramterze kwotê lub liczbê puszek. Cena puszki to ci¹gle 1
public class AutomatPublic {

	private int liczbaMonet;
	private int liczbaPuszek;
	int wrzuconeMonety;

	public AutomatPublic(int liczbaPuszek) {
		this.liczbaMonet = 0;
		this.liczbaPuszek = liczbaPuszek;
		wrzuconeMonety = 0;
	}
	
	private boolean czyWrzuconoMonete(){
		return wrzuconeMonety > 0;
	}
	

	public void przyjmijMonete() {
		if (!czyWrzuconoMonete()) {
			wrzuconeMonety ++;
			liczbaMonet++;
		}
	}

	public void zwrocMonete() {
		if (czyWrzuconoMonete()) {
			liczbaMonet--;
			wrzuconeMonety--;
		}
	}

	public boolean wydajPuszke() {
		if (liczbaPuszek > 0 && czyWrzuconoMonete()) {
			liczbaPuszek--;
			wrzuconeMonety --;
			return true;
		} else
			return false;
	}
}
