package Servicio;
import Dominio.Cuenta;

public class CuentaServicio {
	 private Cuenta cuenta;	    
	 private CareTaker caretaker;

	    public CuentaServicio(Cuenta cuenta) {
	        this.cuenta = cuenta;
	        this.caretaker = new CareTaker();
	    }

	    public void depositar(double monto) {
	        cuenta.depositar(monto);
	        guardarEstado();
	    }

	    public void retirar(double monto) {
	        cuenta.retirar(monto);
	        guardarEstado();
	    }

	    public void guardarEstado() {
	        caretaker.addMemento(cuenta.guardarEstado());
	        System.out.println("Estado guardado.");
	    }

	    public void restaurarEstado(int index) {
	        cuenta.restaurarEstado(caretaker.getMemento(index));
	    }
}
