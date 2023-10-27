package src.strategy;


import src.fabrica.Juguete;
import src.singleton.Menu;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static src.singleton.Menu.juguetes;

public class AccionEliminarXColor implements Accion {
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a Eliminar");
            return;
        }


        final int[] i = {1};
        juguetes.stream()
                .map(Juguete::getColor)
                .distinct()
                .forEach(color -> System.out.println("Key: " + i[0]++ + " " + "--->" + "  " + "Value: " + color));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Color a Eliminar ");
        // Integer ColorElimi = scanner.nextInt();
        String ColoEli1 = scanner.nextLine();

        Set<Juguete> ColorEliminar = juguetes.stream() //filtra por color
                .filter(juguete -> juguete.getColor().equals(ColoEli1))
                .collect(Collectors.toSet());

        System.out.println(ColorEliminar.size());
        
        for (Juguete juguete : ColorEliminar) {
                juguetes.remove(juguete);
                System.out.println("Color " + ColoEli1 + " eliminado con éxito.");
        }

    }

    @Override
    public int getOpcion() {
        return 8;
    }
}
