package src.strategy;

import src.fabrica.Juguete;

import static src.singleton.Menu.juguetes;

public class AccionRegistro implements Accion{  //mostrar
    @Override
    public void aplicar() {

        System.out.println(" \n Los juguetes creados son: \n");
        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }

    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
