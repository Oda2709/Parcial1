package src.strategy;


import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static src.singleton.Menu.juguetes;

public class AccionClonar implements Accion {

    @Override
    public void aplicar() {
        List<Juguete> juguetes = new ArrayList<>(Menu.juguetes);

        int OpcionClonar = 0;

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a clonar");
            return;
        }
        for (Juguete juguete : juguetes) {
            System.out.println(juguete);
        }
        do {

            System.out.println("""
                    *************************************
                            1. Ingrese id a clonar:
                            2. Salir
                    *************************************""");

            try {
                Scanner scanner = new Scanner(System.in);
                OpcionClonar = scanner.nextInt();
                scanner.nextLine();

                if (OpcionClonar == 1) {

                    System.out.println("escriba el id del juguete que desea clonar: ");
                    int Idclonarjuguete = scanner.nextInt();


                    System.out.println("N° juguetes a clonar: ");
                    int NumClona = scanner.nextInt();

                    System.out.println("Los juguetes clonados son:  ");
                    for (int i = 0; i < NumClona; i++) {
                        Juguete ClonaJuguete = juguetes.get(Idclonarjuguete - 1).clone();
                        ClonaJuguete.setid(Menu.juguetes.size() + 1);  // se envia el clon al SET
                        Menu.juguetes.add(ClonaJuguete);
                        System.out.println(ClonaJuguete);
                    }

                } else if (OpcionClonar == 2) {
                    System.out.println("*********************************");
                    System.out.println("Salida exitosa");
                } else {
                    System.out.println("*********************************");
                    System.out.println("Esta opción no existe");
                }

            } catch (Exception ex) {
                System.out.println("*********************************");
                System.out.println("**Ingreso una opción no valida**");
                System.out.println("*********************************");
            }

            int i=0;
            for(Juguete juguete: juguetes){
                juguete.setid(i++);
            }

        } while (OpcionClonar != 2);

    }

    @Override
    public int getOpcion() {

        return 2;
    }
}
