package PracticaFicheros;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    protected String ruta;
    ArrayList<Figura>figuras=new ArrayList<>();
    File file;
    File file2;
    FileManager(String ruta) {
        this.ruta = ruta;
        try {
            file = new File(ruta);
        }catch (Exception e) {
            System.out.println("El archivo no existe");
            e.printStackTrace();
        }



    }

    public boolean Exists (){

        boolean resultado = file.exists();
        return resultado;

    }


    public void importFromFile()  {
            try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("error.");
            e.printStackTrace();
        }
    }

    public ArrayList<Figura> getDataFromFile() {
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.contains("#")){
                    String[] datos = data.split(",");
                    if (datos[0].equalsIgnoreCase("Cuadrado")) {
                        figuras.add(new Cuadrado(datos[3], datos[1] , datos[2]));
                    } else if (datos[0].equalsIgnoreCase("rectangulo")) {
                        figuras.add(new Rectangulo(datos[5], datos[1], datos[2], datos[3], datos[4]));
                    } else if (datos[0].equalsIgnoreCase("Circulo")) {
                        figuras.add(new Circulo(datos[4], datos[1], datos[2], datos[3]));
                    } else {
                        System.out.println("Error en el formato de los datos.");
                    }

                }

            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("error.");
            e.printStackTrace();
        }
        return figuras;

    }
    public void exportToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(  file2 = new File("C:\\Users\\ALUMNO\\Desktop\\ejerciciiii\\ejrciccioshoy\\src\\PracticaFicheros\\resultado.txt")));
            for (Figura figura : figuras) {
                writer.write(figura.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
