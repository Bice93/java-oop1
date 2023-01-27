package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Conto newConto;
		System.out.println("Inserisci il tuo nome: ");
		String name = s.nextLine();
		
		Random r = new Random();
		
		int accountNumber = r.nextInt(999)+1;
		
		newConto = new Conto(name, accountNumber);
		//System.out.println(newConto.name + " - "  + newConto.accountNumber);
		System.out.println("Che tipo di operazione vuoi svolgere?");
		System.out.println("* Versamento");
		System.out.println("* Prelievo");
		System.out.println("* Esci");
		
		String choise = s.nextLine();

		if (choise.equals("Versamento")) {
			System.out.println("Quanto vuoi versare?");
			int money = Integer.parseInt(s.nextLine());
			System.out.println("Il tuo saldo attuale è: " + newConto.addMoney(money));
		}
		
		
		s.close();
	}

}
