package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibilotekaInterfejs;

public class Biblioteka implements BibilotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		if (k == null || knjige.contains(k))
			throw new RuntimeException("Knjiga je null ili vec postoji.");
		knjige.add(k);

	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if (k == null || knjige.contains(k))
			throw new RuntimeException("Knjiga je null ili vec postoji.");
		knjige.remove(k);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		if (naslov == null)
			return null;

		LinkedList<Knjiga> novaLista = new LinkedList<Knjiga>();

		if (naslov == null)
			throw new RuntimeException("Morate uneti naslov.");

		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov))
				novaLista.add(knjige.get(i));
		}
		return novaLista;

	}

}
