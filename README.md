# Factory-Method-ST0250-2018-2
Factory-Method: Implementación del patrón Factory method mediante el ejemplo de Spotify, donde cada funcionalidad se crea a partir del patrón.
## Integrantes
Alejandro Cano Múnera,
Luis Javier Palacio Mesa,
Sebatián Giraldo Gómez.
## Patrón de diseño
Factory Method design pattern.
## Justificación del uso del patrón de diseño
Utilizamos el ejemplo del funcionamiento de Spotify dado a que este nos ayuda a ejemplificar de una manera correcta y explicativa el patrón de diseño factory method. En este ejemplo utilizamos dos funcionalidades de Spotify las cuales son reproducir canción y reproducir video. Cuando se ingresa el nombre de alguno de estos dos elementos, siguiendo con el patrón factory method, se lleva a una clase donde se determina de qué tipo es el elemento, y se devuelve el tipo de objeto requerido para seguir con el proceso en el programa, es decir, al ingresar un nombre correspondiente se devuelve si es de tipo Cancion o si es de tipo Video, cabe aclarar que ambos se rigen por la clase Abstracta contenido que actúa de plantilla para estos.
## Diagrama de clases de la solución implementada
![alt text](https://github.com/alejocano22/Factory-Method-ST0250-2018-2/blob/master/Diagramas/DiagramaSpotify.png)
## Lenguaje de programación
El lenguaje de programación usado para el desarrollo de este patrón de diseño fue JAVA versión 8 Update 191 CPU
## Ejecución del código
El método main del código, donde se inicia su ejecución, está en la clase Spotify.java, allí se pide que se ingrese el nombre de una canción o video que se desea reproducir (Se cuenta con el manejo de excepciones cuando se ingresa un nombre invalido), este nombre se lleva a la clase construir contenido la cual determinara de que tipo es el archivo que se va a reproducir y devuelve el tipo del archivo, el cual es capturado y reproducido según el método reproducir en cada clase: Cancion o Video, además estas dos clases heredan de contenido quien dictamina la estructura que deben seguir dichas clases.
## Referencias bibliográficas
- [1] Wikipedia. Información recuperada de:  https://es.wikipedia.org/wiki/Patr%C3%B3n_de_dise%C3%B1o
- [2] Wikipedia. Información recuperada de: https://es.wikipedia.org/wiki/Builder_(patr%C3%B3n_de_dise%C3%B1o)
- [3] Wikipedia. Información recuperada de: https://es.wikipedia.org/wiki/Factory_Method_(patr%C3%B3n_de_dise%C3%B1o)
- [4] Reactive Programming. Información recuperada de: https://reactiveprogramming.io/books/design-patterns/es/catalog/factory-method
- [5] Mi granito de Java. Información recuperada de: http://migranitodejava.blogspot.com/2011/05/factory-method.html
