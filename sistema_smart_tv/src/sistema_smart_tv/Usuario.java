package sistema_smart_tv;

public class Usuario {

	public static void main(String[] args) throws Exception{
		
		SmartTv smartTv = new SmartTv(); //declarou o objeto
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume Atual: " + smartTv.volume);
		
		System.out.println("Canal Atual: " + smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual: " + smartTv.canal);
		
		//System.out.println("TV Ligada? " + smartTv.ligada);
		//System.out.println("Canal Atual? " + smartTv.canal);
		//System.out.println("Volume Atual " + smartTv.volume);
		
		//smartTv.ligar();
		//System.out.println("Novo Status TV -> Ligada! " + smartTv.ligada);
		
		
	}
	
}
