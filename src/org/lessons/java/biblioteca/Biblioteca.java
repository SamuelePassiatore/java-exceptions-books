package org.lessons.java.biblioteca;

import java.util.Scanner;

public class Biblioteca {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Quanti libri vuoi inserire? ");
	     int numLibri = sc.nextInt();
	     sc.nextLine();
	     
	     Libro[] libri = new Libro[numLibri];
	     int libriCreati = 0;
	     
	     for (int i = 0; i < numLibri; i++) {
	            System.out.println("Inserisci i dati per il libro #" + (i+1) + ":");
	            System.out.println("Titolo: ");
	            String titolo = sc.nextLine();
	            System.out.println("Numero di pagine: ");
	            int numeroPagine = sc.nextInt();
	            sc.nextLine(); 
	            System.out.println("Autore: ");
	            String autore = sc.nextLine();
	            System.out.println("Editore: ");
	            String editore = sc.nextLine();
	            
	            try {
	                libri[i] = new Libro(titolo, numeroPagine, autore, editore);
	                libriCreati++;
	            } catch (Exception e) {
	                System.err.println("Errore nella creazione del libro #" + (i+1) + ": " + e.getMessage());
	                i--; 
	            }
	     }
	     
	     System.out.println("Congratulazioni, hai creato " + libriCreati + " libri!");
	     
	     sc.close();
	 }
}
