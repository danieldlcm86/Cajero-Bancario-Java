package cajeroAutomatico;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuentaDeDaniel = new CuentaBancaria();
			cuentaDeDaniel.titular = "Daniel Maldonado";
			cuentaDeDaniel.tipoDeCuenta = "Ahorro";
			cuentaDeDaniel.saldo = 4800.22;	
		
		CuentaBancaria cuentaDeKaren = new CuentaBancaria();
			cuentaDeKaren.titular = "Karen Montejo";
			cuentaDeKaren.tipoDeCuenta = "Nómina";
			cuentaDeKaren.saldo = 25458.22;
		
		CuentaBancaria cuentaDeIan = new CuentaBancaria();
			cuentaDeIan.titular = "Ian Alexis";
			cuentaDeIan.tipoDeCuenta = "Ahorro";
			cuentaDeIan.saldo = 522.00;
		
		//Invocando los métodos desde CuentaBancaria
		cuentaDeDaniel.sacarDinero(1000);//retirando dinero
		System.out.println(cuentaDeDaniel.saldo);
		
		cuentaDeKaren.ingresarDinero(1000);
		System.out.println(cuentaDeKaren.saldo);
		
		cuentaDeIan.cambiarTipoDeCuenta("Nómina");
		System.out.println(cuentaDeIan.tipoDeCuenta);
		
		
		
	}
}
