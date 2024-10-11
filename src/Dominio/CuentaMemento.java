package Dominio;

public class CuentaMemento {
	private final double saldo;

    public CuentaMemento(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
