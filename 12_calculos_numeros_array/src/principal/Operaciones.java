package principal;

import java.util.Scanner;
//pruebo a subirlo a github
public class Operaciones {

	public static void main(String[] args) {
		int[] nums=new int[10];
		int max=0;
		double media=0;
		Scanner sc=new Scanner(System.in);
		//leer y guardar n�meros
		for(int i=0;i<nums.length;i++) {
			System.out.println("Introduce n�mero:");
			nums[i]=sc.nextInt();
		}
		//calculos
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			media=media+nums[i];
		}
		media=media/nums.length;
		System.out.println("Valor m�ximo: "+max);
		System.out.println("Media: "+media);
	}

}
