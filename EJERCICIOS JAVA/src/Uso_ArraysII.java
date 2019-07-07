//import javax.swing.JOptionPane;


public class Uso_ArraysII {

	public static void main(String[] args) {
		
		//EJEMPLO DE ARREGLOS TRADICIONALES
		
		//String[] paises = new String[8];
		
		/*paises[0] = "Republica Dominicana";
		paises[1] = "EUA";
		paises[2] = "Peru";
		paises[3] = "Brazil";
		paises[4] = "Puerto Rico";
		paises[5] = "Venezuela";
		paises[6] = "Argentina";
		paises[7] = "Colombia";
		*/
		
		//String[] paises={"RD", "PERU"};
		
		//BUCLE FOR TRADICIONAL:
		
		/*for (int i = 0; i < paises.length; i++) {
			
			System.out.println("Pais " + (i +1) +" "+ paises[i]);
			
		}
		*/
		
		int[] matriz_aleatorios = new int[150];
		

		for (int i=0; i < matriz_aleatorios.length; i++){

		matriz_aleatorios[i]=(int) Math.round(Math.random()*100); 
		
		
	    /*for (int i = 0; i < paises.length; i++) {
	    	
	    	paises[i]=JOptionPane.showInputDialog("Ingresa pais " +(i+1));
			
		}
		*/
		
		//BUCLE FOR MODERNO. FOR EACH.
		
		/*for(String conteo : paises){
			
			System.out.println(conteo);
		}
		*/
		
		for(int aleatorio:matriz_aleatorios){
			
			System.out.print(aleatorio + " ");
		}
		
		}
		

	}

}
