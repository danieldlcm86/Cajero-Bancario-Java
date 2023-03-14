package com.maldonado.banco;

import java.util.Scanner;

public class ConversorDivisas {

	public static void main(String[] args) {
		//Convertir MXN a EUR, MXN a USD y viceversa
		// 1EUR = 22MXN
		// 1USD = 20MXN
		
		System.out.println("Bienvenido, elija la opción deseada: ");
		System.out.println("- Para convertir Pesos Mexicanos (MXN) a Euros (EUR), presione 1.");
		System.out.println("- Para convertir Pesos Mexicanos (MXN) a Dólares (USD), presione 2.");
		System.out.println("- Para convertir Euros (EUR) a Pesos Mexicanos (MXN), presione 3.");
		System.out.println("- Para convertir Dólares (USD) a Pesos Mexicanos (MXN), presione 4.");
		System.out.println("- Para cancelar la operación, presione 0.");
		
		Scanner scanner = new Scanner(System.in);
		int opcionSeleccionada;
		
		do {
			System.out.println("Escriba la opción deseada: ");
			opcionSeleccionada = scanner.nextInt();{
				
			switch(opcionSeleccionada) {
			case 1:
				System.out.println("Has seleccionado la opción de convertir MXN a EUR.");
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Ingresa la cantidad de MXN a convertir: ");
				double MXNaEUR = scanner1.nextDouble();
				double conversionMXNaEUR = MXNaEUR / 22;
				System.out.println("Has convertido $" + MXNaEUR + " pesos mexicanos en \u20AC" + conversionMXNaEUR + " euros.");
				break;
			case 2:
				System.out.println("Has seleccionado la opción de convertir MXN a USD.");
				Scanner scanner2 = new Scanner (System.in);
				System.out.println("Ingresa la cantidad de MXN a convertir: ");
				double MXNaUSD = scanner2.nextDouble();
				double conversionMXNaUSD = MXNaUSD / 20;
				System.out.println("Has convertido $ " + MXNaUSD + " pesos mexicanos en $" + conversionMXNaUSD + " dólares.");
				break;
			case 3:
				System.out.println("Has seleccionado la opción de convertir EUR a MXN.");
				Scanner scanner3 = new Scanner(System.in);
				System.out.println("Ingresa la cantidad de EUR a convertir: ");
				double EURaMXN = scanner3.nextDouble();
				double conversionEURaMXN = EURaMXN * 22;
				System.out.println("Has convertido \u20AC" + EURaMXN + " en $" + conversionEURaMXN + " pesos mexicanos.");
				break;
			case 4:
				System.out.println("Has seleccionado la opción de convertir USD a MXN.");
				Scanner scanner4 = new Scanner(System.in);
				System.out.println("Ingresa la cantidad de dólares a convertir: ");
				double USDaMXN = scanner4.nextDouble();
				double conversionUSDaMXN = USDaMXN * 20;
				System.out.println("Has convertido $" + USDaMXN + " dólares en $" + conversionUSDaMXN + " pesos mexicanos.");
				break;
			case 0:
				System.out.println("Has cancelado la operación.");
				break;
				default:
				System.out.println ("La opción seleccionada es incorrecta, intente nuevamente.");
				}
			}
		} while (opcionSeleccionada != 0);
		scanner.close();
	}

}
