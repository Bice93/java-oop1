package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	//Caratteristiche prodotto
	int numberCode;
	String name;
	String description;
	int price;
	int iva = 10;
	String code;
	
	//Costruttore
	public Prodotto(String name, int price) {
		Random r = new Random();
		this.name = name;
		this.price = price;
		numberCode = r.nextInt(99999);
		code = String.format("%08d", numberCode);
		
	};
	
	//Prendo il prezzo
	int getPrice() {
		return price;
	}
	
	//Prendo il prezzo con iva
	int getPriceIva() {
		return price + ((price * iva)/100);
	}
	
	//Prendo il nome esteso
	String getExtendedName() {
		return code + "-" + name;
	}
	
}
