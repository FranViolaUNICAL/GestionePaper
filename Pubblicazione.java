package gestionepaper;
import java.util.*;

public class Pubblicazione {
	private String codice;
	private String titolo;
	private ArrayList<String> autori = new ArrayList<>();
	private ArrayList<Autore> oautori = new ArrayList<>();
	private int data;
	
	public Pubblicazione(String codice, String titolo, ArrayList<Autore> autori) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.oautori = autori;
		this.autori = new ArrayList<>();
		for(int i = 0; i < autori.size(); i++) {
			this.autori.add(autori.get(i).getNome());
		}
	}

	public ArrayList<Autore> getOautori (){
		return this.oautori;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public ArrayList<String> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autore> autori) {
		this.autori = new ArrayList<>();
		for(int i = 0; i < autori.size(); i++) {
			this.autori.add(autori.get(i).getNome());
		}
	}
	
	public String toString() {
		return this.titolo;
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(!(o instanceof Pubblicazione)) return false;
		Pubblicazione p = (Pubblicazione) o;
		String code1 = this.codice;
		String code2 = p.codice;
		return code1.equals(code2);
				
	}
	
	
	
	
}
