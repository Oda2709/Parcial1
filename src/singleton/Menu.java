package src.singleton;

import src.fabrica.Juguete;

import java.util.*;

public class Menu {
    private static Menu intance;
    public static Set<Juguete> juguetes = new LinkedHashSet<>();

    private Menu() {

    }

    public static Menu getInstance() {
        if (intance == null) {
            intance = new Menu();
        }
        return intance;
    }

    public void intance(String msg) {

        System.out.println(msg);
    }
}
