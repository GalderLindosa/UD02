package ejercicio21U2;
import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double sueldo;
		double porcentajeRetencion;
		
		System.out.println("Introduce el sueldo del trabajador ");
		sueldo = teclado.nextDouble();
		if (sueldo<1000) {System.out.println(" "+ numero1 +" ");
			porcentajeRetencion=0.10;
		}
		
		}else if (sueldo == 1000){System.out.println(" "+ numero1 +" ");
			porcentajeRetencion=0.12;

	}
		else {System.out.println("  "+ numero2 +" ");
			porcentajeRetencion=0.14;
			double retencion = sueldo * porcentajeRetencion;
			System.out.println("La retención aplicada es : %.2 ");
			
			teclado.close();

	}

}

