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

        System.out.println(" \n Los juguetes creados son: \n");
        for (Juguete juguete : Menu.juguetes) {
            System.out.println(juguete);
        }

        int i = 0; //Ordena
        for (Juguete juguete : juguetes) {
            juguete.setid(i++);
        }
    }

    @Override
    public int getOpcion() {

        return 4;
    }
}
