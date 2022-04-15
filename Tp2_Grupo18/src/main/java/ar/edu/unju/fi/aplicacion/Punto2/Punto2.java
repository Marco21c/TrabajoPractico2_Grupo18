package ar.edu.unju.fi.aplicacion.Punto2;

import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double numero;
		Scanner dato = new Scanner(System.in);
		System.out.println("ingrese año: ");
		numero=dato.nextDouble();
		if (numero%4 == 0 && numero%100 != 0) {
			System.out.println("es un año bisiesto");
		}
		else {
			if (numero%400 == 0 && numero%100 == 0) {
				System.out.println("es un año bisiesto");
			}
			else {
				System.out.println("no es un año bisiesto");
			}
		}
		
	}

}
