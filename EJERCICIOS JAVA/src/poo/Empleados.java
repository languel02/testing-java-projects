package poo;

public class Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados2 trabajador1 = new Empleados2("Miguel");
		
		Empleados2 trabajador2 = new Empleados2("Rossy");
		
		Empleados2 trabajador3 = new Empleados2("Carol");
		
		Empleados2 trabajador4 = new Empleados2("Albert");
		
		trabajador1.cambiaSeccion("RRHH");
		
		
		
		/*System.out.println(trabajador1.devuelveDatos());
		
		//Empleados2.Id++; //EJEMPLO DE INCREMENTO DE ID POR LA CLASE STATIC.
		
		System.out.println(trabajador2.devuelveDatos());
		
		//Empleados2.Id++;
		
		System.out.println(trabajador3.devuelveDatos());
		
		//Empleados2.Id++;
		
		System.out.println(trabajador4.devuelveDatos());
		*/
		
		
		//IMPRIMIR TODO DESDE UN SOLO SYSTEM CONCATENANDO.
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() +
				"\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados2.dameIdSiguiente());

	}

}


class Empleados2{
	
	public Empleados2(String nom){
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion){//SETTER
		
		this.seccion=seccion;
	}
	
	public String devuelveDatos(){
		
		return "El nombre es: " + nombre + ", la seccion " + seccion + " y el id="+ Id;
	}
	
	public static String dameIdSiguiente(){
		
		return "El idSiguiente es: " + IdSiguiente;
	}
	
	final private String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
}

class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int ano, int mes, int dia){
		
		super(nom, sue, ano, mes, dia);
	}
	
	public void estableceIncentivo(double b){
		
		incentivo=b;
	}
	
	public double dameSueldo(){
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
		
	}
	
	private double incentivo;
}