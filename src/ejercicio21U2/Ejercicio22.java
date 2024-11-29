package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("Introduce un numero para ver cuanto le falta para llegar al 100 ");
		numero = teclado.nextInt();
		if (numero<=10) {System.out.println("le falta para llegar al número 100:  "+(100-numero*numero)+" numeros");
		}
		else {System.out.println("le sobran para llegar al número 100:  "+(100-numero*numero)+" numeros");
	
		}
		
		
		teclado.close();
	}
	

}
