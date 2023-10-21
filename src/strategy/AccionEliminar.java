package src.strategy;

import src.fabrica.Juguete;

import java.util.*;

import static src.singleton.Menu.juguetes;

public class AccionEliminar implements Accion {

    // Esta acción permite eliminar todos los Id que desee
    @Override
    public void aplicar() {
        int OpcionEliminar = 0;

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a eliminar");
            return;
        }

        for (Juguete juguete : juguetes) {
            System.out.println(juguete);
        }
        do {

            System.out.println("""
                    *************************************
                            1. Ingrese id a eliminar:
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
                            juguetes.remove(juguete);
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

           /* for (int i = 0; i < juguetes.size(); i++) { //Ciclo organiz
                juguetes.get(i).setid(i + 1);

            }*/
            /*Collections.sort(juguetes, new Comparator<Juguete>() {
                @Override
                public int compare(Juguete o1, Juguete o2) {

                    return o1.getid() - o2.getid();
                }
            });*/

        } while (OpcionEliminar != 2);

       // return null;
    }

    @Override
    public int getOpcion() {

        return 3;
    }
}
