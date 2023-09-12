package src.strategy;

import src.fabrica.Carrito;
import src.fabrica.Juguete;
import src.fabrica.Peluche;
import src.factorymethod.CreadorCarrito;
import src.factorymethod.CreadorJuguete;
import src.factorymethod.CreadorPeluche;

import java.util.Scanner;

public class AccionCrear implements Accion{
    CreadorCarrito creadorCarrito = new CreadorCarrito();
    CreadorPeluche creadorPeluche = new CreadorPeluche();

    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void aplicar() {
        int opcioncrear = 0;

            System.out.println("""
                    Que juguete desea crear:
                     1 para Peluche  
                     2 para carrito:
                      ************************""");
            opcioncrear = scanner.nextInt();
            scanner.nextLine();
            // crear un do while...
            try {
                if (opcioncrear == 1) {
                    creadorPeluche.crear();
                }else if (opcioncrear == 2) {
                    creadorCarrito.crear();
                } else {
                    System.out.println("Usted ingreso una opción no valida");
                }
            } catch (Exception ex) {
                System.out.println(" Error -> " + ex.toString());
            }



    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
