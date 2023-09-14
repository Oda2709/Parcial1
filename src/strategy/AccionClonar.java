package src.strategy;

import src.fabrica.Carrito;
import src.fabrica.Juguete;

import java.util.Collections;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class AccionClonar implements Accion{

    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void aplicar() {

        System.out.println("escriba el id del juguete que desea clonar: ");
        int clonarjuguete = scanner.nextInt();

        boolean clonacion = false;
        for (Juguete juguete : juguetes) {
            if (juguete.getid() == clonarjuguete) {
                Carrito cloncarrito =  (Carrito) juguete;
                Carrito cloncarrito2 = cloncarrito.clone();
                juguetes.add(cloncarrito2);
                System.out.println("El clon es: \n" + cloncarrito2);

                clonacion = true;
                break;
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
