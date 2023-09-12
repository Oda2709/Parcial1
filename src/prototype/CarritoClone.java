package src.prototype;

public class CarritoClone {


    private  String color;
    private  String marca;
    private  int numeroPuertas;

   public CarritoClone(String color, String marca, int numeroPuertas){
       this.color = color;
       this.marca = marca;
       this.numeroPuertas = numeroPuertas;
   }

   public CarritoClone (CarritoClone carritoClone){
       this.color = carritoClone.color;
       this.marca = carritoClone.marca;
       this.numeroPuertas = carritoClone.numeroPuertas;
   }

    public CarritoClone() {

    }


    public CarritoClone clone(){

       return new CarritoClone(this);
   }

    @Override
    public String toString() {
        return "CarritoClone{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                '}';
    }
}
