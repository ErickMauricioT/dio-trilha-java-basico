package Variaveis;

public class OpLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		            //E
		if(condicao1 && (7 > 4 )) {
			System.out.println("as duas condições do &&(E) sao verdadeiras");
		}
		           //OU
		if(condicao1 || condicao2) {
			System.out.println("uma das condições do ||(OU) sao verdadeiras");
		}
		
		System.out.println("Fim");
		
	}
}
