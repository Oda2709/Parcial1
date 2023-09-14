package src.strategy;

import src.fabrica.Carrito;
import src.fabrica.Juguete;

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
                //nt id = juguete.getid();
                Carrito cloncarrito =  (Carrito) juguete;
                juguetes.add(cloncarrito);
                System.out.println(cloncarrito );
                System.out.println(clonarjuguete);
                clonacion = true;
                break;
            }
        }


    }
    @Override
    public int getOpcion() {

        return 2;
    }
}
