package principal;
//lo subo a github
import java.util.Scanner;

import modelo.GestionNotas;

public class Notas {
	
	public static void main(String[] args) {
		GestionNotas gnotas=new GestionNotas();
    
        Scanner sc=new Scanner(System.in);
        int op;//opcion elegida
        do{
           System.out.println("1.- Añadir nota");
           System.out.println("2.- Media");
           System.out.println("3.- Aprobados");
           System.out.println("4.- Mostrar todas");
           System.out.println("5.- Salir");
           op=sc.nextInt();
           switch(op){
               case 1:
                   System.out.println("Nota:");
                   double d=sc.nextDouble();
                   gnotas.agregarNota(d);
                   break;
               case 2:
                   System.out.println("Media:"+gnotas.media());
                   break;
               case 3:
                   System.out.println("Aprobados:"+gnotas.aprobados());
                   break;
               case 4:
            	  mostrarNotas(gnotas.devolverNota());
                   break;
               case 5:
            	   break;
               default:
                   System.out.println("debes escribir una opción válida");
           }
        }while(op!=5);
    }
	
	private static void mostrarNotas(Double []valores) {
		for(Double d:valores) {
			
			System.out.print(d+",");
		}
		System.out.println("\n");
	}
 
}
