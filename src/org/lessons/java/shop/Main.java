package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Prodotto newProduct = new Prodotto("Borsa", 200);
		
		System.out.println("Prodotto: " + newProduct.getExtendedName());
		System.out.println("Prezzo: " + (float)newProduct.getPrice() + "€");
		System.out.println("Prezzo: " + (float)newProduct.getPriceIva() + "€");
		System.out.println();
		
		//Chiedo il prodotto all'utente
		Scanner s = new Scanner(System.in);
		Prodotto newProduct2;
		
		System.out.print("Inserisci il prodotto: ");
		String name = s.nextLine();
		
		System.out.print("Inserisci il prezzo: ");
		int price = Integer.parseInt(s.nextLine());
		
		newProduct2 = new Prodotto(name, price);
		
		System.out.println("Prodotto: " + newProduct2.getExtendedName());
		System.out.println("Prezzo: " + (float)newProduct2.getPrice() + "€");
		System.out.println("Prezzo: " + (float)newProduct2.getPriceIva() + "€");
		
		s.close();
		}
}
