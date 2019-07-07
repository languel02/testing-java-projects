import javax.swing.JOptionPane;


public class Evalua_email_bucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba = false;
		
		String email = JOptionPane.showInputDialog("Introduce tu email, por favor");
		
		for (int i = 0; i < email.length(); i++) {
			
			if(email.charAt(i)=='@'){
				
				arroba=true;
			}
			
		}
		
		if(arroba == true){
			
			System.out.println("El correo: " + email + " esta correcto.");
		}else{
			
			System.out.println("El correo: "  + email +  " es incorrecto, no contiene arroba.");
		}

	}

}
