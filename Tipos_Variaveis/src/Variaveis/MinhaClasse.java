package Variaveis;

public class MinhaClasse {

	public static void main (String [] args) {
		
		//System.out.print ("olá turma");
		String primeiroNome = "erick";
		String segundoNome = " Mauricio";
		
		String nomeCompleto  = nomeCompleto (primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome ) {
		
		return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);
		
	}
	
}
