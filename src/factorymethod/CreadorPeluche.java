package src.factorymethod;


import src.fabrica.Juguete;
import src.fabrica.Peluche;
import src.singleton.*;
import java.util.Scanner;
import static src.singleton.Menu.juguetes;

public class CreadorPeluche implements CreadorJuguete{


    public static Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {
        System.out.println("Ingrese un color");
        String co=scanner.nextLine();
        System.out.println("Ingrese un Material Exterior");
        String ma= scanner.nextLine();
        System.out.println("Ingrese Relleno");
        String  rll= scanner.nextLine();
        int id = juguetes.size();


        Peluche peluche = new Peluche.PelucheBuilder()
                .color(co)
                .materialExterior(ma)
                .relleno(rll)
                .id(id)
                .build();

        juguetes.add(peluche);
        // System.out.println(peluche);

        for (Juguete juguete: juguetes) { // verificar que si se almacene el juguete en la lista
            System.out.println(juguete);
        }
        return peluche;
    }
}

