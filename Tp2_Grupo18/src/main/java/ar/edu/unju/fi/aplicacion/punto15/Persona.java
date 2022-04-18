package ar.edu.unju.fi.aplicacion.punto15;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Persona {
    //atributos
	private String Nombre;
	private LocalDate fecha_de_nac;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public LocalDate getFecha_de_nac() {
		return fecha_de_nac;
	}
	public void setFecha_de_nac(LocalDate fecha_de_nac) {
		this.fecha_de_nac = fecha_de_nac;
	}
	//metodos
	
	public void calculo_años(LocalDate fecha_nac){
	  LocalDate fecha_actual = LocalDate.now();
	  Period transcurrido = Period.between(fecha_nac, fecha_actual);
	  int años = transcurrido.getYears(); 
	 System.out.println("Edad: " + años);
	}
	public void signo_zodiaco(LocalDate fecha_nac){
	int dia = fecha_nac.getDayOfYear();
	String signo;
	if(dia>=21 && dia<=51)
	  signo = "Acuario";
	else if(dia>=52 && dia<=80)
	  signo= "Piscis";
	else if(dia>=81 && dia<=111)
	  signo = "Aries";
	else if(dia>=112 && dia<=140)
	  signo = "Tauro";
	else if(dia>=141 && dia<=172)
	  signo = "Geminis";
	else if(dia>=173 && dia<=202)
	  signo = "Cancer";
	else if(dia>=203 && dia<=234)
	  signo = "Leo";
	else if(dia>=235 && dia<=264)
	  signo = "Virgo";
	else if(dia>=265 && dia<=294)
	  signo ="Libra";
	else if(dia>=295 && dia<=326)
	  signo="Escorpio";
	else if(dia>=327 && dia<=356)
	  signo="Sagitario";
	else 
      signo="Capricornio";


	System.out.println("Su signo es: " + signo);
	}	
	
	public void estacion(LocalDate fecha_nac){
		int dia = fecha_nac.getDayOfYear();
	    String estac;
		if(dia>=355 || dia<=79)
		   estac = "Verano";
		else if(dia>=264)
			estac = "Primavera";
		else if(dia>=172)
			estac = "Invierno";
		else 
			estac= "Otoño";
	 System.out.println("La estacion es: " + estac);

	}
}
