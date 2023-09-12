package src.factorymethod;

import src.fabrica.Carrito;
import src.fabrica.Juguete;
import src.singleton.Menu;
import java.util.Scanner;
import static src.singleton.Menu.juguetes;


public class CreadorCarrito implements CreadorJuguete {

    public static Scanner scanner = new Scanner(System.in);
    @Override
    public Juguete crear() {
        System.out.println("Ingrese un color");
        String C = scanner.nextLine();
        System.out.println("Ingrese una Marca");
        String M= scanner.nextLine();
        System.out.println("Ingrese N° de puertas");
        int  NP= scanner.nextInt();
        int id = juguetes.size();

        scanner.nextLine();

         Carrito carrito = new Carrito.CarritoBuilder()
                 .color(C)
                  .marca(M)
                   .id(id)
                    .numeroPuertas(NP)
                .build();


            Menu.juguetes.add(carrito);


       // System.out.println(carrito);

        for (Juguete juguete: juguetes) { // verificar que si se almacene el juguete en la lista
            System.out.println(juguete);
        }

        return carrito;
    }

}
