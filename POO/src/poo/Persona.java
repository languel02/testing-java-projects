package poo;

public class Persona {		
	
	//UNA PERSONA TIENE:
	//ATRIBUTOS O CARACTERISTICAS
	String nombre;
	String apellido;
	String apodo;
	int edad;
	int altura;
	int peso;
	
	boolean estado= false;
	
	public Persona(){
		System.out.println("Se a creado un nuevo objeto del tipo persona");
	}

	
	//Y FUNCIONALIDADES O METODOS
	
	public void levantar(){
		if(estado == true){
		     System.out.println("Miguel ya esta despierto");
		}
		else{
			System.out.println("Miguel se ha levantado");
			estado = true;
		}
	
	}
	public void comer(){
		if(estado == true){
		     System.out.println("Miguel ha empezado a comer");	     
		}
		else{
			System.out.println("Miguel no puede comer durmiendo");
			
		}
	}
	
    public void caminar(){
		if(estado == true){
			System.out.println("Miguel esta caminando");
		}
		
		else{
			System.out.println("Miguel no puede caminar durmiendo");
		}
	}    
    
    public void dormir(){
    	if(estado == true){
			System.out.println("Miguel se durmio");
			estado = false;
			}
		
		else{
			System.out.println("Miguel ya esta durmiendo");
		}
	}

	
}
