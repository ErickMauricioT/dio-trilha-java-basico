package Variaveis;

public class Relacionais {
	public static void main(String[] args) {
	
		//classe Operadores.java
		String nomeUm = "Erick";
		//String nomeDois = "Erick";
		String nomeDois = new String("Erick");
		
		//Usar equals para objeto
		System.out.println(nomeUm.equals(nomeDois));
		
		
		int numero1 = 1;
		int numero2 = 2;

		if(numero1 > numero2)
			System.out.println("Numero 1 (>)maior que numero 2!  " );

		if(numero1 < numero2)
			System.out.println("Numero 1 (<)menor que numero 2! ");

		if(numero1 >= numero2)
			System.out.println("Numero 1 (>=)maior ou igual que numero 2! ");

		if(numero1 <= numero2)
			System.out.println("Numero 1 (<=)menor ou igual que numero 2! ");

		if(numero1 != numero2)
			System.out.println("Numero 1 é (!=)diferente de numero 2! ");
		
		boolean simNao = numero1 == numero2;
		System.out.println("Numero 1 é (==)igual numero 2? " +simNao);
		
		simNao = numero1 != numero2;
		System.out.println("Numero 1 é (!=)diferente do numero 2? " +simNao);
	
	

   }
}