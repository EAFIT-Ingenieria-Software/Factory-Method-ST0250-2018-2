package factory;

import java.util.Scanner;

/**
 * Clase Spotify. En esta clase se contiene el método main del programa, es
 * decir, desde donde se inicia la ejecución.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class Spotify {

    /**
     * Método main. Este método inicia la ejecución del programa.
     *
     * @param args Argumentos de la clase main.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConstruirContenido constructor = new ConstruirContenido();
        System.out.println("Ingrese nombre archivo");
        String nombreArchivo = sc.nextLine();
        try {
            Contenido contenido = constructor.construir(nombreArchivo);
            contenido.reproducir();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
