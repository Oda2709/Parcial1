package src.strategy;

import src.fabrica.Juguete;

import java.util.List;

import static src.singleton.Menu.juguetes;

public class AccionRegistro implements Accion{  //mostrar
    @Override
    public List<Juguete> aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("*********************************************");
            System.out.println("No existen registro de Juguetes creados");
            return juguetes;
        }

        System.out.println(" \n Los juguetes creados son: \n");
        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }

        return null;
    }

    @Override
    public int getOpcion() {

        return 4;
    }
}
