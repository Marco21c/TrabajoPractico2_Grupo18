package ar.edu.unju.fi.aplicacion.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//atributos
public class ProcesoFecha {
private LocalDate fecha1 ;
private LocalDate fecha2 ;
private LocalTime time1;
private LocalTime time2;
private LocalDateTime dateTime1;
private LocalDateTime dateTime2;
//constructores
public ProcesoFecha() {
}
public ProcesoFecha(LocalDate fecha1,LocalDate fecha2) {
	this.fecha1 = fecha1;
    this.fecha2 = fecha2;
} 
public ProcesoFecha(LocalTime time1,LocalTime time2) {
  this.time1 = time1;
  this.time2 = time2;
}
public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
	  this.dateTime1 = dateTime1;
	  this.dateTime2 = dateTime2;
}
//get and set
public LocalDate getFecha1() {
	return fecha1;
}
public void setFecha1(LocalDate fecha1) {
	this.fecha1 = fecha1;
}
public LocalDate getFecha2() {
	return fecha2;
}
public void setFecha2(LocalDate fecha2) {
	this.fecha2 = fecha2;
}
public LocalTime getTime1() {
	return time1;
}
public void setTime1(LocalTime time1) {
	this.time1 = time1;
}
public LocalTime getTime2() {
	return time2;
}
public void setTime2(LocalTime time2) {
	this.time2 = time2;
}
public LocalDateTime getDateTime1() {
	return dateTime1;
}
public void setDateTime1(LocalDateTime dateTime1) {
	this.dateTime1 = dateTime1;
}
public LocalDateTime getDateTime2() {
	return dateTime2;
}
public void setDateTime2(LocalDateTime dateTime2) {
	this.dateTime2 = dateTime2;
}
//metodos
public Period contarTiempoTranscurrido() {
	Period TiempoTrans = Period.between(fecha1, fecha2); 
	return TiempoTrans;
}
public String formatearFecha(LocalDate fecha) {
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String nuevaFecha = fecha.format(formato);	
    return nuevaFecha;	
}
public String compararFechas(){
String retorno;	

	if(fecha1.isAfter(fecha2)) {
		retorno = "fecha1 es posterior a  fecha2";
	}else if(fecha1.isBefore(fecha2)) {
		retorno = "fecha1 es anterior a fecha2";
	}else {
	    retorno = "Ambas fechas son iguales";	
    }
	return retorno;
}
}