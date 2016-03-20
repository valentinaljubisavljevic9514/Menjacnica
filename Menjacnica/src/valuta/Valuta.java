package valuta;

import java.util.LinkedList;

import kursevi.Kurs;

public class Valuta {

	private String nazivValute;
	private String kraciNazivValute;
	private LinkedList<Kurs> kursValute;
	
	public LinkedList<Kurs> getKursValute() {
		return kursValute;
	}
	public void setKursValute(LinkedList<Kurs> kursValute) {
		this.kursValute = kursValute;
	}
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getKraciNazivValute() {
		return kraciNazivValute;
	}
	public void setKraciNazivValute(String kraciNazivValute) {
		this.kraciNazivValute = kraciNazivValute;
	}
	
	
}
