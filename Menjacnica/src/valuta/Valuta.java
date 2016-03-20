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
	@Override
	public String toString() {
		return "Valuta [nazivValute=" + nazivValute + ", kraciNazivValute=" + kraciNazivValute + ", kursValute="
				+ kursValute + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kraciNazivValute == null) ? 0 : kraciNazivValute.hashCode());
		result = prime * result + ((kursValute == null) ? 0 : kursValute.hashCode());
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kraciNazivValute == null) {
			if (other.kraciNazivValute != null)
				return false;
		} else if (!kraciNazivValute.equals(other.kraciNazivValute))
			return false;
		if (kursValute == null) {
			if (other.kursValute != null)
				return false;
		} else if (!kursValute.equals(other.kursValute))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		return true;
	}
	
	
	
}
