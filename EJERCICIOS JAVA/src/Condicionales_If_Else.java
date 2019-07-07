import java.util.Scanner;

public class Condicionales_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CONTROL DE EDAD PARA ENTRAR AL CLUB DE JUEGOS!");
		System.out.println("");
		Scanner condition = new Scanner(System.in);
		
		System.out.println("Favor ingresar su edad para evaluarle:");
		int edad=condition.nextInt();
		
		if(edad <= 17){
			System.out.println("Eres un adolecente, NO PUEDES ENTRAR AL CLUB.");
			
		}
		else if (edad <= 60){
			System.out.println("Eres mayor de edad, PUEDES ENTRAR AL CLUB.");
			}
		else{
			System.out.println("Eres demasiado viejo.");
		}
		//System.out.println(edad);

	}

}
