package factory;

/**
 * Clase Abstracta Contenido. En esta clase se contiene la plantilla base de
 * cómo se debe implementar un contenido en Spotify.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public abstract class Contenido {

    /**
     * Atributo nombre. El cual sera el nombre del contenido a crear.
     */
    protected String nombre;

    /**
     * Constructor de la clase contenido. Para construir un contenido
     *
     * @param nombre Es el nombre del contenido
     */
    public Contenido(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto reproducir. Aquí se implementará en cada contenido la
     * forma en que se reproducirá este.
     */
    abstract void reproducir();
}
