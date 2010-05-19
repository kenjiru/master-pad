package app;

public class Main {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println("Aduna 10 + 20: " + c.aduna(10, 20));
		System.out.println("Scade 30 - 10: " + c.scade(30, 10));
		System.out.println("Inmulteste 5 * 2: " + c.inmulteste(5, 2));
		System.out.println("Imparte 100 / 2: " + c.imparte(100, 2));
	}

}
