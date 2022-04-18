package ar.edu.unju.fi.aplicacion.punto14;

import java.time.LocalDate;

import ar.edu.unju.fi.aplicacion.Punto13.Empleado;

public class punto14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Empleado unEmpleado = new Empleado();
		    Empleado dosEmpleado = new Empleado("Marcos","G18",22.00);
		    Empleado tresEmpleado = new Empleado("Jose",LocalDate.now(),22.00);
		    Empleado cuatroEmpleado = new Empleado("Juan",23.00);
		    
		    unEmpleado.Mostrar();
		    dosEmpleado.Mostrar();
	        tresEmpleado.Mostrar();
	        cuatroEmpleado.Mostrar();
	}
   
}
