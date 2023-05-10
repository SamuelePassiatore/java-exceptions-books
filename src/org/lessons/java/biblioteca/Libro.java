package org.lessons.java.biblioteca;

public class Libro {
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int numeroPagine, String autore, String editore) throws Exception{
		
    	setTitolo(titolo);
    	setNumeroPagine(numeroPagine);
    	setAutore(autore);
    	setEditore(editore);
    }

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		if (titolo.isEmpty()) {
            throw new Exception("Titolo vuoto.");
        }
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws Exception {
        if (numeroPagine <= 0) {
            throw new Exception("Numero di pagine non valido.");
        }
		this.numeroPagine = numeroPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		if (autore.isEmpty()) {
            throw new Exception("Autore vuoto.");
        }
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	@Override
    public String toString() {
        return "Titolo: " + getTitolo() + ", Numero Pagine: " + getNumeroPagine() + ", Autore: " + getAutore() +
                ", Editore: " + getEditore();
    }
}

