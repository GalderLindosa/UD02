package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		int suma=0;
		int contador=0;
		//Busca la suma de todos los números hasta el inclusive
		//El contador empieza de 0 y tengo que hacer que sume la sucesión de numeros hasta el numero
		//colocado por el cliente
		
	    System.out.println("Introduzca un número:");
        numero = teclado.nextInt();
     
        do{System.out.println(numero+(numero+1)+(numero+2)+(numero+3))
        
        }
        while (numero )
        System.out.println(numero);
        numero++;
        

	
        teclado.close();
}
}