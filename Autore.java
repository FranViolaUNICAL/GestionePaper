package gestionepaper;

public class Autore {
	private String nome;
	private String residenza;
	
	public Autore() {
		super();
		this.nome = "John Doe";
		this.residenza = "Springfield";
	}
	
	public Autore(String nome, String residenza) {
		super();
		this.nome = nome;
		this.residenza = residenza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	
	public String toString() {
		return this.nome;
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Autore)) return false;
		if(o == this) return true;
		Autore a = (Autore) o;
		String nome1 = a.nome;
		String nome2 = this.nome;
		return nome1.equals(nome2);
	}
}
