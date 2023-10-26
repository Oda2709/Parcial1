package src.factorymethod;

import src.fabrica.Carrito;
import src.fabrica.Juguete;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class CreadorCarrito implements CreadorJuguete {

    private String CrearColor;
    private String CrearMarca;
    private int NumPuertas;
    int id;

    @Override
    public Juguete crear() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un color");
        CrearColor = scanner.nextLine();
        System.out.println("Ingrese una Marca");
        CrearMarca = scanner.nextLine();
        System.out.println("Ingrese N° de puertas");
        NumPuertas = scanner.nextInt();
        id = juguetes.size();


        Carrito carrito = new Carrito.CarritoBuilder()
                .color(CrearColor)
                .marca(CrearMarca)
                .id(id)
                .numeroPuertas(NumPuertas)
                .build();

        System.out.println(carrito);

        return carrito;
    }


}
