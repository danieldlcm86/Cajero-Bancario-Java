package com.maldonado.banco;

public class CuentaNomina extends CuentaBancaria {
    public CuentaNomina(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        super(titular, tipoDeCuenta, saldo);
    }

    public CuentaNomina(String titular, double saldo) {
        super(titular, saldo);
    }

    public CuentaNomina() {
        super();
    }

    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta Ahorro del banco ***");
        System.out.println("Según el acuerdo firmado por usted....");
        System.out.println("Mientras se mantengan las condiciones de su cuenta, usted no tendrá comisión");
    }
}
