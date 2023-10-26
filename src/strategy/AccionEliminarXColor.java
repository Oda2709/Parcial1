package src.strategy;


import src.fabrica.Juguete;
import src.singleton.Menu;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static src.singleton.Menu.juguetes;

public class AccionEliminarXColor implements Accion{
    @Override
    public void aplicar() {
        Scanner scanner = new Scanner(System.in);

        if (juguetes.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("No existen juguetes a Eliminar");
            return;
        }

        Map<Integer, String> MapEli = new HashMap<>(); //Mapeo de los colores
        juguetes.stream()
                .forEach(color -> MapEli.put(color.getid(), color.getColor()));

        MapEli.forEach((color, id) -> System.out.println("Key: " + color +  " " +  "--->"  + "  "+ "Value: " + id));

       juguetes.stream() //filtra por color
                .filter(color -> color.getColor() !=ColoEli1)
                 .collect(Collectors.toList());
        System.out.println(ColoEli1);


       boolean Eliminar = false;

        Set<String> col = new HashSet<>(); // https://www.techiedelight.com/es/convert-map-list-java-8//
        Menu.juguetes.stream()
                .forEach(color -> col.add(color.getColor()));

       List<Juguete> juguetes1 = new ArrayList<>(juguetes);
        System.out.println(juguetes1);



        System.out.println("Color a Eliminar ");
        String ColoEli1 = scanner.nextLine();
      // Integer ColorElimi = scanner.nextInt();
       //String ColoEli1 = MapEli.get(ColorElimi);
        scanner.nextLine();


        for (Juguete juguete : juguetes1) {
            if (juguete.getColor() == ColoEli1){
                Menu.juguetes.removeIf(color -> col.add(color.getColor()));
                System.out.println("Color" + MapEli + "eliminado con éxito.");
                Eliminar = true;
                break;
            }
        }
        if (!Eliminar) {
            System.out.println("No existe el color a eliminar");
        }
    }

    @Override
    public int getOpcion() {
        return 8;
    }
}
