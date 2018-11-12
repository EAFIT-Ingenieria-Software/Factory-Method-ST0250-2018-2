package factory;

/**
 * Clase Cancion Extiende de Contenido. En esta clase se contiene todo la
 * estructura de una canción, es decir, su constructor y método sobreescrito
 * reproducir.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class Cancion extends Contenido {

    /**
     * Constructor de la clase Cancion.
     *
     * @param nombre Es el nombre de la Cancion a construir
     */
    public Cancion(String nombre) {
        super(nombre);
    }

    /**
     * Método reproducir. Este método indica como se debe reproducir una
     * Cancion.
     */
    @Override
    void reproducir() {
        System.out.println("Reproduciendo la canción " + super.nombre + " turururu");
    }

}
