package presentacion;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("los datos ingresados deben ser mayor a o y positivos");
		System.out.print("Ingrese Recistencia 1. :");
		float res1 = src.nextInt();
		if (res1 <= 0) {
			System.out.println("Las resistencias no son distintas a cero");
			System.out.print("ingrese resistencia 1. :");
			res1 = src.nextInt();
		}
		System.out.print("Ingrese Recistencia 2. :");
		float res2 = src.nextInt();
		if (res2 <= 0) {
			System.out.println("Las resistencias no son distintas a cero");
			System.out.print("ingrese resistencia 2. :");
			res2 = src.nextInt();
		}
		System.out.print("Ingrese Recistencia 3. :");
		float res3 = src.nextInt();
		if (res3 <= 0) {
			System.out.println("Las resistencias no son distintas a cero");
			System.out.print("ingrese resistencia 3. :");
			res3 = src.nextInt();
		}
		
		float restTotal= (1/(1/res1)+(1/res2)+(1/res3));
		System.out.println("La resistencia total es de: "+restTotal);

	}
}
