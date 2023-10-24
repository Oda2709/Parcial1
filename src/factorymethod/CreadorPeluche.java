package src.factorymethod;


import src.fabrica.Juguete;
import src.fabrica.Peluche;
import java.util.Scanner;

import static src.singleton.Menu.juguetes;

public class CreadorPeluche implements CreadorJuguete {
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {
        System.out.println("Ingrese un color");
        String co = scanner.nextLine();
        System.out.println("Ingrese un Material Exterior");
        String ma = scanner.nextLine();
        System.out.println("Ingrese Relleno");
        String rll = scanner.nextLine();
        int id = juguetes.size() + 1;

        Peluche peluche = new Peluche.PelucheBuilder()
                .color(co)
                .materialExterior(ma)
                .relleno(rll)
                .id(id)
                .build();

        System.out.println(peluche);
        return peluche;
    }


}

