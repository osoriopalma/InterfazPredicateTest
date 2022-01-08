package evaluaEmpleados;

import java.util.Arrays;
import java.util.List;


public class Principal {
	public static void main(String[] args) {
		List<Empleado> listaEmpleados = 
				Arrays
				.asList(
				new Empleado("Rodrigo", 25, 1500, "Cobranzas"),
				new Empleado("Alicia", 25, 1500, "Ventas"), 
				new Empleado("Manolo", 30, 1500, "Ventas"),
				new Empleado("Cinthia", 20, 2500, "Mostrador"), 
				new Empleado("Esteban", 19, 7000, "Ventas"),
				new Empleado("Dámaris", 32, 600, "Telemarketing"), 
				new Empleado("Liana", 25, 2500, "Mostrador"),
				new Empleado("Nayeli", 44, 10000, "Ventas"), 
				new Empleado("Flor", 35, 7000, "Compras"),
				new Empleado("German", 20, 1500, "Facturación"), 
				new Empleado("Lidia", 21, 600, "Telemarketing"),
				new Empleado("Eleazar", 33, 600, "Cobranzas"), 
				new Empleado("Javier", 35, 600, "Cobranzas"),
				new Empleado("Paola", 50, 1500, "Compras"), 
				new Empleado("Ignacio", 41, 1500, "Compras"),
				new Empleado("Rodrigo", 40, 7000, "Recursos Humanos"));
		
		
		Evaluador evaluador = new Evaluador();
		System.out.println("Empleados con salario > 5000");
		List<Empleado> empSalariosAltos = evaluador.evaluar(
				listaEmpleados, 
				empleado -> empleado.getSalario() > 5000);
		
		for (Empleado empleado : empSalariosAltos) {
			System.out.println(empleado.getNombre());
		}
		
		System.out.println();
	}
}
