package ar.edu.unju.fi.aplicacion.Punto1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int num;
	     int factorial = 1;
	     
	     do {
	     Scanner entrada = new Scanner(System.in);
	     System.out.println("Ingrese un numero: ");
	     num = entrada.nextInt();
	       if(num>10 || num<0)
	    	    System.out.println("Debe ingresar un valor en el rango de 0 a 10");
	     }while(num>10 || num<0);
	     
	     for(int i=num;i>0;i--)
	       factorial = factorial * i;
	    
	     
	     System.out.println("El factorial es: "+factorial);
	}		

}
