package ejercicio21U2;
import java.util.Scanner;
public class EjerciciodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
         String nombre;
         int menu;
         String palabra;
         String palabra1;
         String palabra2;
         int numero;
         
         System.out.println("Introduzca su nombre");
         nombre = teclado.next();
         System.out.println("Bienvenido "+ nombre + ". ¿Qué quieres hacer?");
         System.out.println("Elige entre estas opciones");
         System.out.println("1.Dar la vuelta a una palabra");
         System.out.println("2.Comparar dos palabras");
         System.out.println("3.Numero de letras");
         System.out.println("4.Repetir palabra");
         System.out.println("6.Salir del programa");

     
         
         menu = teclado.nextInt();
         switch (menu) {
         case 1:
             System.out.println("Introduzca una palabra");
             palabra = teclado.next();
         StringBuilder palabraReves=new StringBuilder(palabra);
         String sCadenaInvertida=palabraReves.reverse().toString();
         System.out.println("La palabra es : " + sCadenaInvertida);
             break;
         case 2:
             System.out.println("Introduzca la primera palabra:");
             palabra1 = teclado.next();
             System.out.println("Introduzca la segunda palabra:");
             palabra2 = teclado.next();
              if (palabra1.equals(palabra2)) {
                  System.out.println("Es igual");
              }
                 else {
                 System.out.println("No es igual");     
                  
              }
             break;
              
         
         case 3:
             System.out.println("Introduzca dos palabras");
             palabra = teclado.next();
             System.out.println("La palabra tiene esta cantidad de letras: " + palabra.length());
             if (palabra.length() <= 7) {
                 System.out.println(" Es una pequeña palabra");
             }
             if (palabra.length() >= 7) {
                 System.out.println(" Es una pequeña grande");
             } 
             break;
         case 4:
             System.out.println("Introduzca una palabra");
             palabra = teclado.next().toUpperCase();
             System.out.println("Introduzca la cantidad de veces que quieres que se repita la palabra");
             numero = teclado.nextInt();    
             while (numero != 0) {
                 System.out.print(palabra + " ");
                 numero --;
             }               
            
             break;
             
             
         case 6:
             System.out.println("Muchas gracias y hasta pronto.");

             break;
         
         }    
         teclado.close();
     }
 }    
