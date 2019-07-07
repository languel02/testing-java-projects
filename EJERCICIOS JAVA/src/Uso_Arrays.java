
public class Uso_Arrays {

	public static void main(String[] args) {
		
		
		//ARREGLOS TRADICIONALES
		
		/*int[] numeros = new int[5];
		
		numeros[0]=20;
		numeros[1]=35;
		numeros[2]=10;
		numeros[3]=14;
		numeros[4]=47;
		*/
		
		/*System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println(numeros[4]);
		*/
		
		//ARREGLOS O MATRICES MODERNOS.
		
		int[] numeros = {5,10,15,20,25};
		
		//SE PUEDE USAR LA PROPIEDAD LENGTH PARA CONTAR MAS NUMEROS EN EL BUCLE.
		for (int i = 0; i < 5; i++) {
			
			System.out.println("El valor del indice " + i + " = " + numeros[i]);
			
		}

	}

}
