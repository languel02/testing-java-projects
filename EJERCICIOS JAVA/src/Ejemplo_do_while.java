import java.util.*;

public class Ejemplo_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El INT DELANTE DEL METODO VUELVE LA SALIDA DEL METODO ENTERO.
		
				int aleatorio = (int)(Math.random()*100);
				
				@SuppressWarnings("resource")
				Scanner entrada = new Scanner(System.in);
				
				int numero=0;
				
				int intentos=0;
				
				do{
					
					intentos++;
					
					System.out.println("Introduce un numero, por favor");
					
					numero = entrada.nextInt();
					
					if(aleatorio < numero){
						
						System.out.println("Mas bajo");
					}
					
					else if(aleatorio > numero){
						
						System.out.println("Mas alto");
					}
				}
				while(numero != aleatorio);
				System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");

	}

}
