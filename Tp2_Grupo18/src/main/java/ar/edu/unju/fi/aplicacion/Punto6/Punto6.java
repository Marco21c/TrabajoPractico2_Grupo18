package ar.edu.unju.fi.aplicacion.Punto6;

import java.util.Scanner;

public class Punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int cal=0;
    
    while(cal>=0) {
    Scanner entrada = new Scanner(System.in);	
    System.out.println("Ingrese calificacion: "); 	
     cal = entrada.nextInt();
    if(cal==6)
    	System.out.println("Alumno regulariza");
    else if(cal>=7 && cal<=10) 
        	System.out.println("El alumno Promociona");
    	else if(cal<6 && cal>=1)
    	    	System.out.println("El alumno desaprueba");
    		else if(cal<0)
    	    	System.out.println("Valor no permitido");
      }
    } 
    
	}
