package src.fabrica;

public interface Juguete {
    int getid();

    void setid(int id);

    String getColor();

    Juguete clone();


}
