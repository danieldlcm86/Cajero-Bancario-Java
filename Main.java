package cajeroAutomatico;

public class Main {
	public static void main(String[] args) {
		CuentaBancaria cuentaDeDaniel = new CuentaBancaria();
		cuentaDeDaniel.titular = "Daniel Maldonado";
		cuentaDeDaniel.tipoDeCuenta = "Ahorro";
		cuentaDeDaniel.saldo = 4800.22;
		
		double saldo = cuentaDeDaniel.obtenerSaldo();
		System.out.println("Su saldo es: " + saldo);
		
		cuentaDeDaniel.sacarDinero(-1000);
		System.out.println("El nuevo saldo es: " + cuentaDeDaniel.obtenerSaldo());		
	}
}
