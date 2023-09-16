package src.strategy;

import src.fabrica.Juguete;
import src.factorymethod.CreadorCarrito;
import src.factorymethod.CreadorPeluche;

import java.util.List;
import java.util.Scanner;

public class AccionCrear implements Accion{
    CreadorCarrito creadorCarrito = new CreadorCarrito();
    CreadorPeluche creadorPeluche = new CreadorPeluche();


    @Override
    public List<Juguete> aplicar() {
        int opcioncrear = 0;
        do {
            System.out.println("""
                  ************************************
                       Que juguete desea crear
           
                          1. Peluche:
                          2. Carrito:
                          3. Salir
                         
                  *************************************""");

        try {
            Scanner scanner = new Scanner(System.in);
            opcioncrear = scanner.nextInt();
            scanner.nextLine();

                if (opcioncrear == 1) {
                    creadorPeluche.crear();
                } else if (opcioncrear == 2) {
                    creadorCarrito.crear();
                } else if (opcioncrear == 3) {
                    System.out.println("Salida exitosa");
                } else {
                    System.out.println("Esta opción no existe");
                }

        }catch(Exception ex){
            System.out.println(" Error -> " + ex.toString());
            System.out.printf("ingreso una letra por favor ingrese solo numeros \n");
        }
        } while (opcioncrear != 3); // permite crear todos los juguetes que desee hasya que escoja la opcion 3

        return null;
    }

    @Override
    public int getOpcion() {

        return 1;
    }
}
