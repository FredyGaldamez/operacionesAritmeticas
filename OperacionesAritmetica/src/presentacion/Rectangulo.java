package presentacion;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		System.out.print("Ingrese el valor Alto: ");
		int alto = src.nextInt();
		System.out.print("Ingrese el valor Largo: ");
		int largo = src.nextInt();
		System.out.print("Ingrese el valor de x: ");
		float x = src.nextFloat();
		if (x >= largo && x >= alto) {
			System.out.println("el valor de x no debe pasar los limites del alto y largo");
			System.out.print("ingrese el valor de x: ");
			x = src.nextFloat();
		}

		int area = largo * alto;
		int perimetro = 2 * largo + 2 * alto;
		float areaSubRectangulo = (largo - 2 * x) * (alto - 2 * x);
		float perimetroSubRectangulo = 2 * (largo - 2 * x) + 2 * (alto - 2 * x);

		if (area == 0 || perimetro == 0) {
			System.out.println("No se puede calcular la nueva área y perímetro");
		} else {
			System.out.println("el area del rectangulo es: " + area);
			System.out.println("el perimetro del Rectangulo es: " + perimetro);
			System.out.println("el valor del area del Sub-Rectanguloes: " + areaSubRectangulo);
			System.out.println("el valor del perimetro del Sub-Rectanguloes: " + perimetroSubRectangulo);
		}

	}

}
