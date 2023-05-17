package gestionepaper;
import java.util.*;


public class Sistema {
	ArrayList<Autore> autori = new ArrayList<>();
	ArrayList<Pubblicazione> pubblicazioni = new ArrayList<>();
	
	
	public ArrayList<String> pubblicazioniCitta(String s){
		ArrayList<Pubblicazione> lista = new ArrayList<>(pubblicazioni);
		ArrayList<String> ret = new ArrayList<>();
		for(int i = 0; i<lista.size();i++) {
			Pubblicazione pub = lista.get(i);
			ArrayList<Autore> autori = new ArrayList<>(pub.getOautori());
			ArrayList<String> citta = estraicitta(autori);
			if(cittauguale(citta)) {
				ret.add(pub.getCodice());
			}
			
		}
		return ret;
	}
	
	private ArrayList<String> estraicitta(ArrayList<Autore> autori){
		ArrayList<String> ret = new ArrayList<>();
		for(int i = 0; i<autori.size();i++) {
			Autore a = autori.get(i);
			ret.add(a.getNome());
		}
		return ret;
	}
	
	private boolean cittauguale(ArrayList<String> citta) {
		String check = citta.get(0);
		boolean ret = true;
		for(int i = 0; i < citta.size(); i++) {
			if(!(check.equals(citta.get(i)))) ret = false;
		}
		return ret;
		
	}
	
	
	
	
///////////////////////////////////////////////////////////////////////////
	
	public ArrayList<Autore> individuali(int d1,int d2){
		ArrayList<Autore> ret = new ArrayList<>();
		for(int i = 0; i<pubblicazioni.size();i++) {
			Pubblicazione a = pubblicazioni.get(i);
			int data = a.getData();
			ArrayList<Autore> autori = a.getOautori();
			if(d1 < data && data > d2) {
				if(autori.size() == 1) {
					ret.add(autori.get(0));
				}
			}
		}
		return ret;
	}
	
	


///////////////////////////////////////////////////////////////////////////

	public ArrayList<Pubblicazione> coautori(Autore a, Autore b){
		ArrayList<Pubblicazione> ret = new ArrayList<>();
		for(int i = 0; i<pubblicazioni.size();i++) {
			Pubblicazione p = pubblicazioni.get(i);
			ArrayList<Autore> lista = p.getOautori();
			boolean check1 = lista.contains(a);
			boolean check2 = lista.contains(b);
			if(check1 && check2) ret.add(p);
		}
		return ret;
	}
}

//////////////////////////////////////////////////////////////////////////