package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		
		
		
	    System.out.println("Introduzca un número:");
        numero = teclado.nextInt();
       
        while (numero >= 1)
        {System.out.println(numero);//se genera bucle (Arreglado)
       numero--;
        
        }
        while (numero <= -1)//se genera bucle (Arreglado)
        {System.out.println(numero);
        numero++;
        

	}
        teclado.close();
}
}