package src.strategy;

import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.Map;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    private  static final int OPCION_SALIR = 5;

    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Map <Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion = 0;
        do {
            menu.intance("""
                    ********************************************
                                           Menú
                                    Fabrica de juguetes
                        Escoja alguna de las siguientes opciones
                                     
                                     1. Crear
                                     2. Clonar
                                     3. Eliminar
                                     4. Ver los juguetes actuales
                                     5. Salir
                    ********************************************
                    """);
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);
            if (OPCION_SALIR == opcion) {
                continue;
            }
            if (accion == null) {
                System.out.println("Esta opción no existe");
            }else {
                accion.aplicar();
            }
        }while (OPCION_SALIR != opcion);
        System.out.println("Salida exitosa");


    }
}
