package Presentacion;
import Dominio.Cuenta;
import Servicio.CuentaServicio;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con saldo inicial de 1000
        Cuenta cuenta = new Cuenta(1000);
        CuentaServicio cuentaService = new CuentaServicio(cuenta);
        
        // Realizar movimientos
        cuentaService.depositar(200);  // Saldo 1200
        cuentaService.retirar(100);    // Saldo 1100
        cuentaService.depositar(50);   // Saldo 1150

        // Restaurar estado anterior
        cuentaService.restaurarEstado(1); // Restaurar al estado después del retiro (Saldo 1100)
    }
}

