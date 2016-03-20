package impementacija;

import java.util.GregorianCalendar;


import interfejs.InterfejsMenjacnice;
import kursevi.Kurs;
import valuta.Valuta;

public class Menjacnica implements InterfejsMenjacnice {

	
	@Override
	public void dodajKurs(Valuta valuta, Kurs kurs) {
		
		valuta.getKursValute().add(kurs);
		
	}

	@Override
	public void obrisiKurs(Valuta valuta, Kurs kurs) {

		valuta.getKursValute().remove(kurs);
		
	}

	@Override
	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta) {
		
		for (int i = 0; i < valuta.getKursValute().size(); i++) {
			if(valuta.getKursValute().get(i).getDatum() == datum &&
					valuta.getNazivValute().equals(valuta.getNazivValute())){
				return valuta.getKursValute().get(i);
			}
			
		}
		
		return null;
	}

}
