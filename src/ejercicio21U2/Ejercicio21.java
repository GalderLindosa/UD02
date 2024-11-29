package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double dinero;
		System.out.println("Introduce la cantidad de de euros para mostrar su IVA: ");
		dinero = teclado.nextDouble();
		if (dinero<20000) {System.out.println("IVA es del "+dinero*7/100+"€");

	}else {System.out.println("IVA es del "+dinero*16/100+"€");
 

}
		teclado.close();

	}

}
