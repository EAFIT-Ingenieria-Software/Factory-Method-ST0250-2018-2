package factory;

/**
 * Clase Video Extiende de Contenido. En esta clase se contiene todo la
 * estructura de un video, es decir, su constructor y método sobreescrito
 * reproducir.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class Video extends Contenido {

    /**
     * Constructor de la clase Video.
     *
     * @param nombre Es el nombre del Video a construir
     */
    public Video(String nombre) {
        super(nombre);
    }

    /**
     * Método reproducir. Este método indica como se debe reproducir un video.
     */
    @Override
    void reproducir() {
        System.out.println("Reproduciendo el video " + super.nombre);
    }

}
