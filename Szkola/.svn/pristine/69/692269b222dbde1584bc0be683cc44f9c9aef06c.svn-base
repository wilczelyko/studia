import java.util.ArrayList;
import java.util.Collection;

public class KatalogKlas {
	ArrayList<Klasa> katalogKlas;
	
	public void dodajKlase(Klasa klasa) {
		katalogKlas.add(klasa);
	}

	public Collection<Klasa> wyszukajKlase(String nazwa, String profil) {
		ArrayList<Klasa> znalezioneKlasy = new ArrayList<Klasa>();
		for (Klasa kl : katalogKlas)
		{
			if (kl.spelniaKryteriaWyszukiwania(nazwa, profil))
				znalezioneKlasy.add(kl);
		}
		return znalezioneKlasy;
	}
}
