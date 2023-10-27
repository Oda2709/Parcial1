package src.strategy;

import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.Map;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class Main {

    private static final int OPCION_SALIR = 9;

    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion = 0;
        do {
            menu.intance("""
                    ********************************************
                                           Menú
                                    Fabrica de juguetes
                              Escoja una opcion:
                                     
                                     1. Crear
                                     2. Clonar
                                     3. Eliminar
                                     4. Registro (Todos los juguetes creados)
                                     5. Impresión de peluches o carritos
                                     6. Impresión del carrito con mayor número de puertas
                                     7. Mapa de juguetes
                                     8. Eliminación de juguetes por color
                                     9. Salir
                    ********************************************
                    """);

            try {
                Scanner scanner = new Scanner(System.in);
                opcion = scanner.nextInt();
                scanner.nextLine();
                Accion accion = strategy.get(opcion);
                if (OPCION_SALIR == opcion) {
                    continue;
                }
                if (accion == null) {
                    System.out.println("*********************************");
                    System.out.println("Esta opción no existe");
                } else {
                    accion.aplicar();
                }
            } catch (Exception ex) {
                System.out.println("*********************************");
                System.out.println("**Ingreso una opción no valida**");
                Menu.getInstance();
            }

        } while (OPCION_SALIR != opcion);
        System.out.println("Salida exitosa");


    }
}
