public enum TipeOfShape {
    TRIANGOLO("Triangolo"),

    CILINDRO("Cilindro") ,

    CERCHIO("Cerchio"),
    RETTANGOLO ("Rettangolo");
    private String caratteristiche;
    TipeOfShape(String caratteristiche) {
        this.caratteristiche = caratteristiche;
    }

    public String getCaratteristiche() {
        return caratteristiche;
    }
}
