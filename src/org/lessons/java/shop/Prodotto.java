package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	//Caratteristiche prodotto
	int numberCode;
	String name;
	String description;
	int price;
	int iva = 10;
	
	//Costruttore
	public Prodotto(String name, int price) {
		Random r = new Random();
		this.name = name;
		this.price = price;
		numberCode = r.nextInt(99999);	
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
		String code;
		code = String.format("%08d", numberCode);
		return code + "-" + name;
	}
	
}
