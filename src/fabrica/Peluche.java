package src.fabrica;

public class Peluche implements Juguete {

    private String materialExterior;
    private String relleno;
    private String color;
    private int id;

    public Peluche(String materialExterior, String relleno, String color, int id) {
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
        this.id = id;
    }

    public Peluche (Peluche peluche){  //Prototype
        this.materialExterior = peluche.materialExterior;
        this.relleno = peluche.relleno;
        this.color = peluche.color;
        this.id = peluche.id;
    }


    public Peluche clone(){ //Prototype Clone
        return new Peluche(this);
    }

    @Override
    public String toString() {
        return "Peluche{" +
                "materialExterior='" + materialExterior + '\'' +
                ", relleno='" + relleno + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id + 1 +
                '}';
    }

    public static PelucheBuilder builder(){

        return new PelucheBuilder();
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


    /*@Override
    public Juguete clonar() {
        return null;
    }*/


    public static class PelucheBuilder {
        private String materialExterior;
        private String relleno;
        private String color;
        private int id;

        public PelucheBuilder materialExterior (String materialExterior){
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno (String relleno){
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color (String color){
            this.color = color;
            return this;
        }

        public PelucheBuilder id (int id){
            this.id = id;
            return this;
        }

        public Peluche build (){

            return new Peluche(materialExterior, relleno, color, id);
        }

    }
}
