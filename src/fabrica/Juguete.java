package src.fabrica;

public interface Juguete {
    int getid();

    void setid(int id);

    String getColor();

    void setColor(String color);


    Juguete clone();


}
