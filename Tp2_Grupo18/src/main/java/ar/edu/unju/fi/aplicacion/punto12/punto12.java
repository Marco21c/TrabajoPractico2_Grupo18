package ar.edu.unju.fi.aplicacion.punto12;

import java.util.Scanner;

public class punto12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese la altura: ");
		double altura = entrada.nextDouble();
		double g = 9.81 ;
		double t = Math.sqrt((2 *altura)/g);
		System.out.println("El tiempo que demora en caer el objeto es: " + t);
	}

}
