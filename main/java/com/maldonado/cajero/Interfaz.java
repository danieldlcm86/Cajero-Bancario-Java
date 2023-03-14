/*Programa que emula la interfaz de un cajero automático. El programa presentará las siguientes funciones:
 * 1. Escriba 1 para consultar su saldo.
 * 2. Escriba 2 para ingresar dinero.
 * 3. Escriba 3 para sacar dinero
 * 4. Escriba 4 para consultar sus últimos movimientos.
 * Una vez seleccionada la opción, pulse la tecla Enter
 * Una vez el usuario haya elegido la opción, el programa mostrará por pantalla el número el número correspondiento a la elección seleccionada
 */

package com.maldonado.cajero;

import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		System.out.println("Introduzca su número de cliente:");
		Scanner scanner = new Scanner(System.in);
		String identificador = scanner.nextLine();
		System.out.println("Introduzca su contraseña:");
		String contrasena = scanner.nextLine();
		CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasena);

		int numeroSeleccionado;

		do {
		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("- Escriba 1 para consultar su saldo.");
		System.out.println("- Escriba 2 para ingresar dinero.");
		System.out.println("- Escriba 3 para retirar dinero.");
		System.out.println("- Escriba 4 para consultar sus últimos movimientos.");
		System.out.println("- Escriba 5 para consultar las condiciones legales.");
		System.out.println("- Para salir, presione 0.");

			numeroSeleccionado = scanner.nextInt();{
			switch(numeroSeleccionado) {
			case 1 :
				cajero.mostrarSaldo();
				break;
			case 2:
				cajero.ingresarDinero();
				break;
			case 3:
				cajero.sacarDinero();
				break;
			case 4:
				cajero.consultarUltimosMovimientos();
				break;
			case 5:
				cajero.mostrarCondicionesLegales();
				break;
			case 0:
				cajero.salir();
				break;
				default: 
					System.out.println("La opción seleccionada es incorrecta.");
					break;
				}
			}
		} while (numeroSeleccionado != 0);
		
		scanner.close();
	}

}
