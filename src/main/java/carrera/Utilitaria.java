package carrera;

/**
 * Clase genera un numero aleatorio entre 1 y 3
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 */
public class Utilitaria {
    /**
     * Metodo para generar el numero aleatorio
     * @return int retorna el numero obtenido
     */
    public static int random(){
        int numero = (int) (Math.random() * 3) + 1;
        return numero;
    }
}
