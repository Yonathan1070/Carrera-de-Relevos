package carrera;

import Logica.Principal;

/**
 * Clase que ejecuta la logica del programa
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 */
public class Main {
    /**
     * Clase main que sirve para ejecutar el programa
     * @param args matriz de argumentos de línea de comando pasados ​​a este método
     */
    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciaCarrera();
    }
}
