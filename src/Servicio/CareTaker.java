package Servicio;
import java.util.ArrayList;
import java.util.List;

import Dominio.CuentaMemento;

public class CareTaker {
    private List<CuentaMemento> mementos = new ArrayList<>();

    public void addMemento(CuentaMemento memento) {
        mementos.add(memento);
    }

    public CuentaMemento getMemento(int index) {
        return mementos.get(index);
    }
}
