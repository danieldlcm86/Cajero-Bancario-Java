package com.maldonado.cajero;

import com.maldonado.banco.CuentaAhorro;
import com.maldonado.banco.CuentaBancaria;
import com.maldonado.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    private CuentaBancaria cuentaBancariaActual;

    public CajeroAutomatico(String identificador, String contrasenha) {
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
        cuentaBancariaActual = new CuentaAhorro("Daniel Maldonado", cantidadAleatoria);
    }

    protected void mostrarSaldo(){
        System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
    }

    protected void ingresarDinero(){
        System.out.println("¿Cuánto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }

    protected void sacarDinero(){
        System.out.println("¿Cuánto dinero quiere sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }

    protected void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "euros");
        mostrarMovimientos(movimientos);
    }

    private void mostrarMovimientos(ArrayList<String> movimientos){
        for(String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }

    protected void mostrarCondicionesLegales(){
        cuentaBancariaActual.informarSobreCondicionesLegales();
    }

    protected void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios.");
    }
}
