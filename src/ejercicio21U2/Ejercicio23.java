package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		System.out.println("Introduce dos numeros para compararlos y ver cual es el más grande ");
		System.out.println("a: ");		
		numero1 = teclado.nextInt();
		System.out.println("b: ");
		numero2 = teclado.nextInt();
		System.out.println("Resultado");
		if (numero1>numero2) {System.out.println("El numero más grande es el:  "+ numero1 +" ");
		
	}else if (numero1==numero2){System.out.println("Ambos numeros son iguales:  "+ numero1 +" ");

}
	else {System.out.println("El numero más grande es el:  "+ numero2 +" ");
		
		
	}
		teclado.close();
	}
}
