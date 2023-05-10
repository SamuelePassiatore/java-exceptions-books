package org.lessons.java.biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Biblioteca {
	 private static final String FILENAME = "C:\\Users\\samuw\\Libri.txt";
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
	     
	     printBooksToFile(libri);
	     readBooksFromFile();
	 }
	 
	 public static void printBooksToFile(Libro[] libri) {

			try {

				FileWriter writer = new FileWriter(FILENAME);
				
				for (int i = 0; i < libri.length; i++) {
		            Libro libro = libri[i];
		            writer.write("Titolo: " + libro.getTitolo() + "\n");
		            writer.write("Numero di pagine: " + libro.getNumeroPagine() + "\n");
		            writer.write("Autore: " + libro.getAutore() + "\n");
		            writer.write("Editore: " + libro.getEditore() + "\n\n");
		        }

				writer.close();
			} catch (Exception e) {

				System.err.println("Errore nella creazione del Libro.txt\n" + e.getMessage());
			}
	 }
	 
	 public static void readBooksFromFile() {
		 	
		 	File myFile = new File(FILENAME);

			try {
				
				Scanner reader = new Scanner(myFile);
				System.out.println("Biblioteca:"); 

				while (reader.hasNextLine()) {
		            System.out.println(reader.nextLine()); 
				}
				
				reader.close();
				
			} catch (Exception e) {

				System.err.println("Errore nella lettura di Libri.txt\n" + e.getMessage());
			}
	 }
}
