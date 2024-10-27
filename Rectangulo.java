package PracticaFicheros;

public class Rectangulo extends Figura {
    private String l1;
    private String l2;
    private String l3;
    private String l4;
    public Rectangulo( String color, String l1, String l2, String l3, String l4) {
        super.color = color;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;

    }
    @Override
    public void calcularArea() {
        System.out.println("calculará el área del rectángulo");
    }
    public String toString() {
        return "Rectangulo{" +
                "color='" + color + '\'' +
                ", l1='" + l1 + '\'' +
                ", l2='" + l2 + '\'' +
                ", l3='" + l3 + '\'' +
                ", l4='" + l4 + '\'' +
                '}'+"\n";
    }

}
