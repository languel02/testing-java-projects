import java.util.*;

import javax.swing.JOptionPane;

public class Testing_knowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave1 = "God";
		
		String st = "Jesus";
		
		String clave2 = "";
		
		while(clave1.equalsIgnoreCase(clave2)==false && st.equals(clave2)==false){
			
			clave2=JOptionPane.showInputDialog("Ingrese la clave para entrar al cielo");
			
			if(clave1.equalsIgnoreCase(clave2)==false && st.equals(clave2)==false){
				
				System.out.println("Disculpe! No tienes la clave correcta para entrar al cielo");
				System.out.println("Trate nuevamente!");
			}
		}
		
		System.out.println("Clave validada! Tienes permiso para entrar al cielo.");

	}

}
