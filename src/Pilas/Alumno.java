package Pilas;

/**
 *
 * @author SANTIAGO
 */
public class Alumno {

    private String nombre;
    private String Universidad;

    // contructor para inicializar las variables
    public Alumno() {
        this.nombre = "";
        this.Universidad = "";
    }

    // para recibir los parametros
    public Alumno(String nombre, String universidad) {
        this.nombre = nombre;
        this.Universidad = universidad;
    }

    // getter retorna el valor
    public String getNombre() {
        return nombre;
    }

    public String getUniversidad() {
        return Universidad;
    }

    // set establece el contenido de la variable
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

}
