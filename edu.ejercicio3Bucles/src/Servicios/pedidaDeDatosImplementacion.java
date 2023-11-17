package Servicios;

import java.util.Scanner;

public class pedidaDeDatosImplementacion implements pedidaDeDatosInterfaz{

	public int pedidaDatos(Scanner sc) {
		
		System.out.println("Escribe un numero del 1 al 100: ");
		int numero = sc.nextInt();
		return numero;
	}
}
