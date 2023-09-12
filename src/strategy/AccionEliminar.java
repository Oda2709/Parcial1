package src.strategy;

import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import static src.singleton.Menu.juguetes;

public class AccionEliminar implements Accion{

    public static Scanner scanner = new Scanner(System.in);
    @Override
    public void aplicar() {

    int opcioneliminar = 0;

            System.out.println("""
                          Que juguete desea eliminar?
                    
                      ************************""");


        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }

        System.out.println("Ingrese id");
        int eliminar = scanner.nextInt();


        for (Juguete juguete : juguetes) {
            if (juguete.getid() == eliminar) {
                juguetes.remove(juguete);
                //actualizaIDs(juguetes);/// aqui la array list debe organizarse
                System.out.println("Objeto eliminado con éxito.");

            break;
            }
        }
        for (int i = 0; i < juguetes.size(); i++){
            juguetes.get(i).setid(i);
        }
        Collections.sort(juguetes, (o1, o2) -> Integer.compare(o1.getid(), o2.getid()));

        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }



}

    @Override
    public int getOpcion() {
        return 3;
    }
}
