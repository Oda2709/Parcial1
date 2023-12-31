package src.strategy;

import src.fabrica.Carrito;
import src.fabrica.Peluche;

import java.util.Comparator;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class AccionPrintPoC implements Accion {
    @Override
    public void aplicar() {
        int OpcionPrintPoC = 0;
        do {
            if (juguetes.isEmpty()) {
                System.out.println("*********************************");
                System.out.println("No existen juguetes a imprimir");
                return;
            }

            System.out.println("""
                    *************************************
                    Escoja:
                            1. Imprimir los carritos:
                            2. Imprimir los peluches:
                            3. Salir
                    *************************************""");

            try {
                Scanner scanner = new Scanner(System.in);
                OpcionPrintPoC = scanner.nextInt();
                scanner.nextLine();

                if (OpcionPrintPoC == 1) {
                    System.out.println("Los carritos son:  ");
                    juguetes.stream()
                            .filter(juguete -> juguete instanceof Carrito)
                            .sorted(Comparator.comparing(juguete -> juguete.getid(), Comparator.reverseOrder()))
                            .forEach(System.out::println);
                } else if (OpcionPrintPoC == 2) {
                    System.out.println("Los peluches son:  ");
                    juguetes.stream()
                            .filter(juguete -> juguete instanceof Peluche)
                            .sorted(Comparator.comparing(juguete -> juguete.getid(), Comparator.reverseOrder()))
                            .forEach(System.out::println);

                } else if (OpcionPrintPoC == 3) {
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
        } while (OpcionPrintPoC != 3); // permite crear todos los juguetes que desee hasya que escoja la opcion 3
    }

    @Override
    public int getOpcion() {

        return 5;
    }
}
