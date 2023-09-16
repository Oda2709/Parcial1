package src.factorymethod;

import src.fabrica.Carrito;
import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.List;
import java.util.Scanner;
import static src.singleton.Menu.juguetes;


public  class CreadorCarrito implements CreadorJuguete {

    private String CrearColor;
    private String CrearMarca;
    private int NumPuertas;

    int id;



    @Override
    public Juguete crear() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un color");
            
           String CrearColor = scanner.nextLine();


            System.out.println("Ingrese una Marca");
            String CrearMarca = scanner.nextLine();
            System.out.println("Ingrese N° de puertas");
            int NumPuertas = scanner.nextInt();
            int id = juguetes.size() + 1;



         Carrito carrito = new Carrito.CarritoBuilder()
                 .color(CrearColor)
                  .marca(CrearMarca)
                   .id(id)
                    .numeroPuertas(NumPuertas)
                .build();


            Menu.juguetes.add(carrito);



        for (Juguete juguete: juguetes) { // verificar que si se almacene el juguete en la lista
            System.out.println(juguete);
        }

        return carrito;


    }



}
