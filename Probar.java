package PracticaFicheros;

public class Probar {

    public static void main(String[] args) {
            FileManager procesador = new FileManager("C:\\Users\\ALUMNO\\Desktop\\ejerciciiii\\ejrciccioshoy\\src\\PracticaFicheros\\datos.txt");

        System.out.println(procesador.Exists());
       procesador.importFromFile();
        System.out.println( procesador.getDataFromFile());
        procesador.exportToFile();

    }
}
