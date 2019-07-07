package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// FORMA LARGA Y CONVENCIONAL
		
		/*Empleado empleado1= new Empleado("Miguel Medina", 25000, 1989, 9, 05);
		Empleado empleado2= new Empleado("Rossy Perez", 50000, 2000, 1, 8);
		Empleado empleado3= new Empleado("Carlos Perez", 45000, 1990, 12, 1);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
				+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
				+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
				+ "  Fecha de Alta: " + empleado3.dameFechaContrato());
				*/
		
		
		//FORMA MODERNA CON ARRAYS
		
		Empleado [] misEmpleados = new Empleado[5];
		
		misEmpleados[0]= new Empleado("Miguel Medina", 25000, 1989, 9, 05);
		
		misEmpleados[1]= new Empleado("Ana Lopez", 5000, 1981, 7, 01);
		
		misEmpleados[2]= new Empleado("Rossy Perez", 205000, 1989, 1, 8);
		
		misEmpleados[3]= new Empleado("Gloria Antonia");
		
		misEmpleados[4]= new Empleado("Gricel Marte");
		
		
		/*for (int i = 0; i < 3; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}
		*/
		
		//USO DEL BUCLE FOR MEJORADO //PARA SUBIR SUELDO.
		
		for(Empleado e: misEmpleados){
			
			e.subeSueldo(5);
		}
		
		
		/*for(int i = 0; i<3; i++){
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
					+ " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		//UTILIZANDO EL BUCLE FOR MEJORADO. 
		
		for(Empleado e: misEmpleados){
			
			System.out.println("Nombre: " + e.dameNombre()
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}

	}

}


class Empleado{
	
	public Empleado(String nom, double sue, int ano, int mes, int dia){
		
		nombre=nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario  = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	//SOBRE CARGA DE CONSTRUCTORES
	public Empleado(String nom){
		
		//nombre=nom;
		//EL THIS LLAMA  AL OTRO CONSTRUCTOR Y ASIGNA LOS PARAMETROS
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre(){//GETTER
		
		return nombre;
	}
	
	public double dameSueldo(){//GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato(){//GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){//SETTER
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}