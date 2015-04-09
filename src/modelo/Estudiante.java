/**
 * Objeto Estudiante
 */
package modelo;


/**
 *
 * @author vini
 */
public class Estudiante {

    private String nombre;
    private String carnet;
    private int edad;
    private static String [] etiquetas = {"Carnet", "Nombre", "Edad"};

    //-------------------------------------------------------------
    /**
     * 
     * @param nombre
     * @param edad
     * @param carnet 
     */
    public Estudiante(String nombre, int edad, String carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.edad = edad;
    }

    //////////////////////////////////////////////////////////
    /**
     * 
     * @return String []
     */
    public static String [] getEtiquetas () {
        return etiquetas;
    }
    
    //////////////////////////////////////////////////////////
    /**
     * 
     * @param numeroAtributos
     * @return int numero de atributo
     */
    public String getAtributos (int numeroAtributos) {
        switch (numeroAtributos) {
            case 0:
                return carnet;
            case 1:
                return nombre;
            case 2:
                return Integer.toString(edad);
            default:
                return null;
        }
    }
    
    
/////////////////////////////////////////////////////////
    /**
     * 
     * ************ metodos sets & gets ***********
     */
    public static int getNumeroAtributos () {
        return etiquetas.length;
    }
    
    /////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getEdad() {
        return edad;
    }
    
    public String getEdadString () {
        return edad+"".toString().trim();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return String informacion del objeto
     */
    public String getInformacion() {
        return this.getCarnet()+"\t"+this.getNombre()+"\t\t"+this.getEdad();
    }

}
