import javax.swing.*;


public class Entrada_Usuario {

	
	public static void main(String[] args) {
		
		// EJEMPLO DE ENTRADA DE USUARIO CON LA CLASE SCANNER.
		
		/*Scanner entradaUsuario = new Scanner(System.in);
		
		System.out.println("Favor ingresar tu nombre:");
		
		String nombre=entradaUsuario.nextLine();
		
		System.out.println("Favor ingresar edad:");
		
		int edad=entradaUsuario.nextInt();
		
		System.out.println("Mi nombre es "+nombre + " y tengo "+edad + " anos de edad ");
		*/
		
		
		//EJEMPLO DE ENTRADA DE USUARIO CON LA CLASE JOptionpane.
		
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre por favor:");
		
		String apellido = JOptionPane.showInputDialog("Ingresa tu apellido por favor:");
		
		String edad = JOptionPane.showInputDialog("Ingresa tu edad por favor:");
		
		int realEdad=Integer.parseInt(edad);
		
		
		System.out.println("Hola mi nombre es " + nombre + " " +apellido + " y tendre " + (realEdad+1) + " anos de edad en septiembre.");
		
		

	}

}
