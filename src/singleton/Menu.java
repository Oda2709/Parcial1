package src.singleton;

import src.fabrica.Juguete;
import src.strategy.AccionHandler;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Menu intance;
    public static List <Juguete> juguetes = new ArrayList<>();
    private AccionHandler accionHandler = new AccionHandler();
    private Menu(){

    }
    public static Menu getInstance(){
        if (intance == null) {
            intance = new Menu();
        }
        return intance;
    }
    public void intance(String msg){

        System.out.println(msg);
    }
}
