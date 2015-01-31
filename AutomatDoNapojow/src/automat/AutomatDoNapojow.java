package automat;

public class AutomatDoNapojow {

	private int liczbaMonet;
	private int liczbaPuszek;
	boolean czyWrzuconoMonete;

	public AutomatDoNapojow(int liczbaPuszek) {
		this.liczbaMonet = 0;
		this.liczbaPuszek = liczbaPuszek;
		this.czyWrzuconoMonete = false;
	}

	public static void main(String[] args) {

	}

	private void przyjmijMonete() {
		liczbaMonet++;
	}

	private void zwrocMonete() {
		liczbaMonet--;
	}

	private boolean wydajPuszke() {
		if (liczbaPuszek > 0) {
			liczbaPuszek--;
			return true;
		} else {
			zwrocMonete();
			return false;
		}
	}

	public boolean przyjmijMoneteIWydajPuszke() {
		przyjmijMonete();
		return wydajPuszke();
	}
}
