package com.maldonado.banco;

public class CuentaAhorro extends CuentaBancaria{
    private final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        super(titular, tipoDeCuenta, saldo);
    }

    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    public CuentaAhorro() {
        super();
    }

    @Override
    public void sacarDinero(double cantidad){
        if(cantidad < 0) {
            return;
        }
        saldo -= cantidad;
        saldo -= COMISION;
    }

    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta Ahorro del banco ***");
        System.out.println("Según el acuerdo firmado por usted....");
        System.out.println("Las comisiones por retirada de dinero de su cuenta serán de " + COMISION + " euros");
    }
}
