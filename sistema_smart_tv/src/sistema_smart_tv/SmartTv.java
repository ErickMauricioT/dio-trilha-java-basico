package sistema_smart_tv;

public class SmartTv {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	            
	            //metodo e parametro
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		
	}
	            //metodo
	public void descerCanal() {
		volume--; 
		System.out.println(" <-- Voltando o Canal : " + canal);
	}
	
	public void subirCanal() {
		volume++;
		System.out.println(" --> Passando o Canal: " + canal);
	}
	
	public void diminuirVolume() {
		volume--; //o mesmo que: volume = volume - 1; -- é o mesmo valor menos 1
		System.out.println("Dimunuindo o Volume para: " + volume);
	}
	
	public void aumentarVolume() {
		volume++; //o mesmo que: volume = volume + 1; ++ é o mesmo valor mais 1
		System.out.println("Aumetando o Volume para: " + volume);
	}
	
	public void ligar() {
		ligada = true;
		
	}
	
	public void desligar() {
		ligada = false;
		
	}
	
	
	
}
