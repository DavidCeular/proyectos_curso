package loteria;
//prueba github
public class Loteria {
//compartir version nuevo cambio 4 en github
	public static void main(String[] args) {
		
	
	int contador=0;
	int [] combinacion =new int [6];

	while(contador<=5) {
		int numero=(int)(Math.ceil(Math.random()*48))+1;
		if ((numero!=combinacion[5])&&(numero!=combinacion[4])&&(numero!=combinacion[3])&&(numero!=combinacion[2])&&(numero!=combinacion[1])&&(numero!=combinacion[0])) {
			combinacion[contador]=numero;
			contador++;
			}
		}	
	System.out.println("\nEl resultado de la primitiva es: ");
	for(int n:combinacion) {
		System.out.print(" "+n);
		}
	}
}
	


