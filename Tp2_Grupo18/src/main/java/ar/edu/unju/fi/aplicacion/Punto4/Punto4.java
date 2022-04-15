package ar.edu.unju.fi.aplicacion.Punto4;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		//variable logica
		boolean band=true;
		//metodo para detectar mes ingresado
		Mes unMes = new Mes();
		//metodo para ingreso de datos
		Scanner entrada = new Scanner(System.in);
		
		while (band==true) {
			System.out.println("ingrese mes: ");
			num=entrada.nextInt();
		if (num >= 1 && num <= 12){
			unMes.CalcularMes(num);
		}
		else {
			System.out.println("no existe ese mes");
			band=false;
		}
	}
	}

}
