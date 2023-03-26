package modelo.javabean;
import java.util.Scanner;
/**
 * 
 * @author CheteMR
 * @version 1.0
 * 
 * Se realiza un pequeño cajero automático con las siguientes opciones:
 * 
 * 1. Ingresar
 * 2. Retirar
 * 3. Salir
 */

public class CajeroAutomatico {

	public static void main(String[] args) {
		
		final int saldoInicial = 1000;
		int opcion;
		double ingreso, saldoActual, retirar;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("\nBienvenido a su cajero automático. ¿Qué quiere hacer?");
		System.out.println("1. Ingresar dinero en la cuenta");
		System.out.println("2. Retirar dinero de la cuenta");
		System.out.println("3. Salir");
		
		opcion=entrada.nextInt();
		
		switch (opcion) {
		case 1:
		case 2: 
		case 3:
		}
		
		
		
		
		

	}

}
