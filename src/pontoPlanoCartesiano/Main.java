package pontoPlanoCartesiano;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double coordenada1, coordenada2;

		System.out.println("Digite dois valores de coordenada (x e Y):");
		coordenada1 = (int) sc.nextDouble();
		coordenada2 = (int) sc.nextDouble();

		if (coordenada1 == 0 && coordenada1 == 0) {
			System.out.println("Origem");
		} else 
			if (coordenada1 > 0 && coordenada2 > 0) {
			System.out.println("Q1");
			} else 
				if (coordenada1 < 0 && coordenada2 < 0) {
				System.out.println("Q3");
				} else 
					if (coordenada1 < 0 && coordenada2 > 0) {
					System.out.println("Q2");
					} else
					System.out.println("Q4");
		sc.close();
	}

}
