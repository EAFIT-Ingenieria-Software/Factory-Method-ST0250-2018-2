package factory;

/**
 * Clase ConstruirContenido. En esta clase se contiene el metodo construir que
 * basicamente devolvera el tipo de objeto a construir.
 *
 * @author Alejandro Cano Múnera
 * @author Luis Javier Palacio Mesa
 * @author Sebastián Girlado Gómez
 * @version Noviembre 2018
 */
public class ConstruirContenido {

    /**
     * Método construir. Este método recibe como parámetro un nombre y determina
     * de qué tipo es, si es tipo cancion devuelve una Cancion y si es de tipo
     * video devuelve un Video, además identifica cuando se trata de un nombre
     * no válido para el sistema.
     *
     * @param name Es el nombre del objeto a cosntruir
     * @return Se retorna el tipo de objeto Contenido que se va a contruir.
     * @throws Exception Se usa para identificar cuando el parámetro name no
     * corresponde a los Contenidos establecidos.
     */
    Contenido construir(String name) throws Exception {
        if (name.toLowerCase().endsWith(".mp3")) {
            return new Cancion(name);
        } else if (name.toLowerCase().endsWith(".mp4")) {
            return new Video(name);
        }
        throw new Exception("Este tipo de archivo no se reconoce");
    }
}
