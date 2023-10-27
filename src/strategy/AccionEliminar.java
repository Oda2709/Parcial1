package src.strategy;

import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.*;

import static src.singleton.Menu.juguetes;

public class AccionEliminar implements Accion {


    @Override
    public void aplicar() {
        int OpcionEliminar = 0;

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a eliminar");
            return;
        }

        for (Juguete juguete : Menu.juguetes) {
            System.out.println(juguete);
        }
        do {

            System.out.println("""
                    *************************************
                            1. Seleccione id a eliminar:
                            2. Salir
                    *************************************""");

            try {
                Scanner scanner = new Scanner(System.in);
                OpcionEliminar = scanner.nextInt();
                scanner.nextLine();

                if (OpcionEliminar == 1) {

                    System.out.println("Id a Eliminar ");
                    int IDeliminar = scanner.nextInt();
                    scanner.nextLine();

                    boolean Eliminar = false;
                    for (Juguete juguete : juguetes) {
                        if (juguete.getid() == (IDeliminar)) {
                            Menu.juguetes.remove(juguete);
                            System.out.println(juguete);
                            System.out.println("Id eliminado con éxito.");
                            Eliminar = true;
                            break;
                        }
                    }
                    if (!Eliminar) {
                        System.out.println("No existe el Id a eliminar");
                    }


                } else if (OpcionEliminar == 2) {
                    System.out.println("*********************************");
                    System.out.println("Salida exitosa");
                } else {
                    System.out.println("*********************************");
                    System.out.println("Esta opción no existe");

                }

            } catch (Exception ex) {
                System.out.println("*********************************");
                System.out.printf("**Ingreso una opción no valida**");
                System.out.println("*********************************");
            }
            int i = 0; //Ordena
            for (Juguete juguete : Menu.juguetes) {
                juguete.setid(i++);
            }

        } while (OpcionEliminar != 2);

        // return null;
    }

    @Override
    public int getOpcion() {

        return 3;
    }
}
