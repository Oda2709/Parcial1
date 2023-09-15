package src.strategy;

import src.fabrica.Carrito;
import src.fabrica.Juguete;

import java.util.Collections;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class AccionClonar implements Accion{


    @Override
    public void aplicar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba el id del juguete que desea clonar: ");
        int clonarjuguete = scanner.nextInt();
        Juguete juguete;

        for (Juguete juguete : juguetes) {

                if (juguete.getid() == (clonarjuguete - 1)) {
                    System.out.println("El clon es: \n" + juguete);

                }

        }

        for (int i = 0; i < juguetes.size(); i++){ //Ciclo
            juguetes.get(i).setid(i);

        }
        Collections.sort(juguetes, (primero, segundo) -> Integer.compare(primero.getid(), segundo.getid()));


    }



    @Override
    public int getOpcion() {

        return 2;
    }
}
