import javax.swing.JOptionPane;


public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//APLICACION SIMULANDO LA ENTRADA DE CONTRASENA USANDO EL MEDOTO EQUALS DE LA CLASE STRING.c
		
		String clave ="Miguel";
		
		String password ="";
		
		while(clave.equals(password)==false){
			
			password=JOptionPane.showInputDialog("Introduce contrasena, por favor");
			
			if(clave.equals(password)==false){
				
				System.out.println("Contrasena incorrecta! Favor reintentar nuevamente.");
			}
		}
		
           System.out.println("Contrasena correcta, acceso permitido");
	}

}
