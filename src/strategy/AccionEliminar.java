package src.strategy;

import src.fabrica.Juguete;

import java.util.Collections;
import java.util.Scanner;
import static src.singleton.Menu.juguetes;

public class AccionEliminar implements Accion{

    private int id;

    @Override
    public void aplicar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                          Que juguete desea eliminar?
                    
                      ************************""");


        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }

        System.out.println("Ingrese id");
        int eliminar = scanner.nextInt();

        for (Juguete juguete : juguetes) {
            if (juguete.getid() == (eliminar - 1)) {
                juguetes.remove(juguete);
                //actualizaIDs(juguetes);/// aqui la array list debe organizarse
                System.out.println("Objeto eliminado con éxito.");

            break;
            }
        }
        for (int i = 0; i < juguetes.size(); i++){ //
            juguetes.get(i).setid(i);

        }
        Collections.sort(juguetes, (primero, segundo) -> Integer.compare(primero.getid(), segundo.getid()));

        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }



}

    @Override
    public int getOpcion() {

        return 3;
    }
}
