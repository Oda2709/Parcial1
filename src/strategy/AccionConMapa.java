package src.strategy;

import src.fabrica.Juguete;

import java.util.stream.Collectors;

import static src.singleton.Menu.juguetes;

public class AccionConMapa implements Accion {
    @Override
    public void aplicar() {
        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes");
            return;
        }
        juguetes.stream()
                .collect(Collectors.toMap(Juguete::getid, juguete -> juguete))
                .forEach((id, juguetes) -> System.out.println("Key: " + id + " " + "--->" + "  " + "Value: " + juguetes));
    }

    @Override
    public int getOpcion() {

        return 7;
    }
}
