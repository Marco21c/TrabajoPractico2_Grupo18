package ar.edu.unju.fi.aplicacion.Punto3;

import java.util.Scanner;

public class Punto3 {
	public static void main(String[] args) {
	int num;
	int cont=0;

    do {
    	 cont=cont+1;
	     Scanner entrada = new Scanner(System.in);
	     System.out.println("Ingrese un numero: ");
	     num = entrada.nextInt();
	    	 if (num%2==0)
	    			 { System.out.println("El numero "+num +" es Par ") ;
	    			 }
	    			 else
	    				 {System.out.println("El numero "+num + " es Impar ");
	    				 }
	     }while(cont!=5);
	
	}
}
