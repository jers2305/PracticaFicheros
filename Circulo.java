package PracticaFicheros;

public class Circulo extends Figura {

    private String radio1;
    private String radio2;
    private String radio3;

    public Circulo(String color,String radio1, String radio2, String radio3) {
        super.color= color;
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
    }

    public void calcularArea(){
        System.out.println("calcular el área del círculo");
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "color='" + color + '\'' +
                ", radio1='" + radio1 + '\'' +
                ", radio2='" + radio2 + '\'' +
                ", radio3='" + radio3 + '\'' +
                '}'+"\n";
    }




}
