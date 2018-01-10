package dado;

public class DadoElectronico {

	public static void main(String[] args) {
		int[] contadores = new int[6];
		final int tiradas=10000000;
		for (int i=0;i<tiradas;i++) {
			int dado= (int)Math.floor(Math.random()*6+1);
			contadores[dado-1]++;
			
		}
		for(int i=0;i<contadores.length;i++) {
			System.out.println("Porcentaje de "+(i+1)+":"+ contadores[i]*100.0/tiradas);
			System.out.println("Tercer cambio");
			//comentario version 4
		}
	}
		
	
	

}
