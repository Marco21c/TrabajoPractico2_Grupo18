package ar.edu.unju.fi.aplicacion.Punto16;

import java.util.Scanner;

public class Punto16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		System.out.println("ingrese valor de N: ");
		int n=ingreso.nextInt();
		CalculoMatematico unCalculo = new CalculoMatematico(n);
		System.out.println("el valor de la sumatoria: "+unCalculo.calcularSumatoria(unCalculo.getN()));
		System.out.println("el valor de la productoria: "+unCalculo.CalcularProductoria(unCalculo.getN()));
	}

}
