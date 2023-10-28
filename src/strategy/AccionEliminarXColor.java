package src.strategy;


import src.fabrica.Juguete;

import java.util.*;
import java.util.stream.Collectors;

import static src.singleton.Menu.juguetes;

public class AccionEliminarXColor implements Accion {
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a Eliminar por color");
            return;
        }
        try {
            final int[] i = {1};
            juguetes.stream()
                    .map(Juguete::getColor)
                    .distinct()
                    .forEach(color -> System.out.println("Key: " + i[0]++ + " " + "--->" + "  " + "Value: " + color));

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba el color a Eliminar ");
            String ColoEli1 = scanner.nextLine();

            Set<Juguete> ColorEliminar = juguetes.stream() //filtra por color
                    .filter(juguete -> juguete.getColor().equals(ColoEli1))
                    .collect(Collectors.toSet());

            boolean Eliminarc = false;
            for (Juguete juguete : ColorEliminar) {
                if (ColoEli1.equals(juguete.getColor())) {
                    juguetes.remove(juguete);
                    System.out.println("Color " + ColoEli1 + " eliminado con éxito.");
                    Eliminarc = true;
                }
            }
            if (!Eliminarc) {
                System.out.println("No existe el color a eliminar");
            }

        } catch (Exception ex) {
            System.out.println("*********************************");
            System.out.printf("**Ingreso una opción no valida**");
            System.out.println("*********************************");
        }


    }


    @Override
    public int getOpcion() {
        return 8;
    }
}
