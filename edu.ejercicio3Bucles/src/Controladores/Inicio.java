package Controladores;

import java.util.Scanner;

import Servicios.pedidaDeDatosImplementacion;
import Servicios.pedidaDeDatosInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		pedidaDeDatosInterfaz pdd = new pedidaDeDatosImplementacion();
		double numeroParaAcertar = Math.random();	
		numeroParaAcertar  =  numeroParaAcertar * 100;
		int numeroParaAcertarEntero = (int) numeroParaAcertar;
		System.out.println("Intenta acertar un numero del 1 al 100");
		
		for (int intentos = 1 ; intentos <= 11 ; intentos++) {
			int numeroDicho = pdd.pedidaDatos(sc);
			System.out.println("Intento numero: " + intentos);
			if(numeroDicho == numeroParaAcertarEntero) {
				
				System.out.println("Has acertado, el numero era: " + numeroParaAcertarEntero);
				break;
			}
			if (numeroDicho>numeroParaAcertarEntero){
			System.out.println("El numero es menor")
			} else if (numeroDIcho<numeroParaAcertarEntero){
			System.out.println("El numero es mayor")
			}
		}
		System.out.println("El numero era: " + numeroParaAcertarEntero);
	}

}
