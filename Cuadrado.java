package PracticaFicheros;

public class Cuadrado extends Figura {
    private String lado1;
    private  String lado2;

    public Cuadrado( String color,String lado1, String lado2) {
        super.color=color;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcularArea() {
        System.out.println("calculando área del cuadrado...");
    }
    @Override
    public String toString() {
        return "Cuadrado{" +
                "color='" + color + '\'' +
                ", lado1='" + lado1 + '\'' +
                ", lado2='" + lado2 + '\'' +
                '}'+"\n";
    }

}
