import javax.swing.JOptionPane;


public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do{
			genero=JOptionPane.showInputDialog("Introduce tu genero (MASCULINO/FEMENINO)");
			
		}while (genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("F")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm por favor"));
		
		int pesoideal = 0;
		
		if(genero.equalsIgnoreCase("M")){
			
			pesoideal=altura-110;
		}
		
		else if (genero.equalsIgnoreCase("F")){
			
			pesoideal=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoideal);

	}
	
}


