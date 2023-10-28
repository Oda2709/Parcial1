package src.strategy;

import src.fabrica.Juguete;
import src.singleton.Menu;

import static src.singleton.Menu.juguetes;

public class AccionRegistro implements Accion {  //mostrar
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("*********************************************");
            System.out.println("No existen registro de Juguetes creados");
            return;
        }

        int i = 0; //Ordena
        for (Juguete juguete : Menu.juguetes) {
            juguete.setid(i++);
        }

        System.out.println(" \n Los juguetes creados son: \n");
        for (Juguete juguete : Menu.juguetes) {
            System.out.println(juguete);
        }

    }

    @Override
    public int getOpcion() {

        return 4;
    }
}
