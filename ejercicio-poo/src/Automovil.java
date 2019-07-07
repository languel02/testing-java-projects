
public class Automovil {

		// ATRIBUTOS O CARACTERISTICAS
	String marca;
	int modelo;
	int precio;
	
	boolean estado = false;
	
	
	//DEFINICION DE CONSTRUCTOR
	
	public Automovil(){
		System.out.println("Se creo un objeto de tipo Automovil");
	}
	
	
	//Metodos o acciones
	
	public void encender(){
		if(estado == true){
			System.out.println("El automovil ya esta encendido");
		}
		else{
		System.out.println("El automovil ha encendido");
		estado = true;
		
		}
	}
	
    public void apagar(){
    	if(estado == true){
    	System.out.println("El automovil se apago");
    	estado = false;
    	}
    	else{
    		System.out.println("El automovil ya esta apagado");
    	}
		
	}
    
    public void avanzar(){
    	if(estado == true){
    	System.out.println("El automovil esta avanzando");
		}
    	else{
    		System.out.println("El automovil no puede avanzar apagado!");
    	}
    }



	
}
