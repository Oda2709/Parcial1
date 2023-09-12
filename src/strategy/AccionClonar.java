package src.strategy;

import src.fabrica.Carrito;
import src.factorymethod.CreadorCarrito;
import src.prototype.CarritoClone;

public class AccionClonar implements Accion{

    CarritoClone clone = new CarritoClone();
    @Override
    public void aplicar() {

        System.out.println(clone);


    }
    @Override
    public int getOpcion() {
        return 2;
    }
}
