
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[][] matrix = new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=25;
		matrix[0][2]=10;
		matrix[0][3]=11;
		matrix[0][4]=19;
		
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=19;
		*/
		
		//ARRAYS FORMA MODERNA.
		
		int [][] matrix = {
				{2,7,9,5,7},
				{5,7,10,12,56},
				{18,3,80,6,20},
				{43,38,1,9,20}
		};
		
		//System.out.println("Valor almacenado en la posicion 2, 3 " + matrix[2][3]);
		
		/*for (int i = 0; i < 4; i++) {
			
			System.out.println();
			
			for(int j =0; j<5; j++){
				
			System.out.print(matrix[i][j]+ " ");
			*/
		
		//UTILIZANDO EL BUCLE FOR MEJORADO O FOR EACH.
		
		for(int[]fila:matrix){
			
			System.out.println();
			
			for(int z: fila){
				
				System.out.print(z + " ");
		
			}
			
		}

	}

}
