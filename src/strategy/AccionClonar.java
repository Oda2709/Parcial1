package src.strategy;


import src.fabrica.Juguete;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class AccionClonar implements Accion{

    @Override
    public List<Juguete> aplicar() {
        int OpcionClonar = 0;

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a clonar");
            return juguetes;
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

            try{
                Scanner scanner = new Scanner(System.in);
                OpcionClonar = scanner.nextInt();
                scanner.nextLine();

                if (OpcionClonar == 1) {

                    System.out.println("escriba el id del juguete que desea clonar: ");
                    int Idclonarjuguete = scanner.nextInt();


                    System.out.println("N° juguete a clonar: ");
                    int NumClona = scanner.nextInt();


                    System.out.println("Los juguetes clonados son:  ");
                    for  (int i = 0; i < NumClona; i++) {
                        Juguete ClonaJuguete = juguetes.get(Idclonarjuguete - 1).clone();
                        ClonaJuguete.setid(juguetes.size() + 1);
                        juguetes.add(ClonaJuguete);
                        System.out.println(ClonaJuguete);
                    }
                } else if (OpcionClonar == 2) {
                    System.out.println("*********************************");
                    System.out.println( "Salida exitosa");
                } else {
                    System.out.println("*********************************");
                    System.out.println("Esta opción no existe");
                }

            }catch(Exception ex){
                System.out.println("*********************************");
                System.out.printf("**Ingreso una opción no valida**");
                System.out.println("*********************************");
            }

            for (int i = 0; i < juguetes.size(); i++){ //Ciclo organiza
                juguetes.get(i).setid(i + 1);

            }
            Collections.sort(juguetes, new Comparator<Juguete>() {
                @Override
                public int compare(Juguete o1, Juguete o2) {

                    return o1.getid() - o2.getid();
                }
            });

        }while (OpcionClonar != 2);

        return null;
    }

    @Override
    public int getOpcion() {

        return 2;
    }
}
