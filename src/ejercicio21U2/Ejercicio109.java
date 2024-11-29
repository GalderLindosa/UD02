package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		int contador=0;
		
		
	    System.out.println("Introduzca un número para ver todos los pares que tiene:");
        numero = teclado.nextInt();
       
        while (contador <= numero) 
        {System.out.println(contador);
        contador=contador+2;
        
        
        }               
        
        
        teclado.close();

	}

}
