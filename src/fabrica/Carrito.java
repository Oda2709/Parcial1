package src.fabrica;

import static src.singleton.Menu.juguetes;

public class Carrito implements Juguete {

    private String color; // Final por que son inmutables
    private String marca;
    private int numeroPuertas;

    private int id;

    public Carrito(String color, String marca, int numeroPuertas, int id) {
        this.color = color;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.id = id;
    }

    public Carrito(Carrito carrito) { //Prototype
        this.color = carrito.color;
        this.marca = carrito.marca;
        this.numeroPuertas = carrito.numeroPuertas;
    }

    @Override
    public Juguete clone() {

        return new Carrito(this);
    }

    @Override
    public String toString() {

        return "Carrito -->  " +
                " Id = "  + id +
                " | Color = " + color +
                " | Marca   = " + marca +
                " | Numero de Puertas = " + numeroPuertas  ;
    }

    public static CarritoBuilder builder(){

        return new CarritoBuilder();
    }


    @Override
    public int getid() {

        return id;
    }

    @Override
    public String getcorlor() {

        return color;
    }

    @Override
    public void setid(int id) {

        this.id = id;
    }




    public static class CarritoBuilder {
        private String color;
        private String marca;
        private int numeroPuertas;
        private int id;


        public CarritoBuilder color (String color){
            this.color = color;
            return this;
        }

        public CarritoBuilder marca (String marca){
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas (int numeroPuertas){
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder id (int id){
            this.id = id;
            return this;
        }

        public Carrito build (){

            return new Carrito(color, marca , numeroPuertas, id);
        }

    }
}
