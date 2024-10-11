package Dominio;


public class Cuenta {
	 private double saldo;

	    public Cuenta(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    public void depositar(double monto) {
	        saldo += monto;
	        System.out.println("Depósito de: " + monto + ". Saldo actual: " + saldo);
	    }

	    public void retirar(double monto) {
	        saldo -= monto;
	        System.out.println("Retiro de: " + monto + ". Saldo actual: " + saldo);
	    }

	    // Crear un Memento con el estado actual
	    public CuentaMemento guardarEstado() {
	        return new CuentaMemento(saldo);
	    }

	    // Restaurar el estado desde un Memento
	    public void restaurarEstado(CuentaMemento memento) {
	        this.saldo = memento.getSaldo();
	        System.out.println("Estado restaurado. Saldo actual: " + saldo);
	    }

	    public double getSaldo() {
	        return saldo;
	    }

}
