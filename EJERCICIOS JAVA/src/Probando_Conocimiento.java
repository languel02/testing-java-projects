import javax.swing.JOptionPane;


public class Probando_Conocimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Seleccione una opcion: \n1: Dios, \n2: Jesus, \n3: Espiritu Santo");
		
		int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion"));
		
		switch(seleccion){
		
		case 1:
			System.out.println("Dios es bueno y Padre eterno.");
			
			break;
			
		case 2:
			
			System.out.println("Jesus es el Rey y Salvador del universo.");
			break;
			
		case 3:
			
			System.out.println("El Espiritu Santo fue derramado sobre nuestros corazones.");
			break;
		}
		
		//System.out.println(seleccion);

	}

}
