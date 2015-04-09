/**
 * Objeto Curso
*/
package modelo;

/**
 *
 * @author vini
 */
public class Curso {
    
    private String nombre;
    private String siglas;
    private int creditos;
    private static String [] etiquetas = {"Nombre", "Siglas", "Creditos"};

//----------------------------------------------------------------
    /**
     * 
     * @param nombre
     * @param siglas
     * @param creditos 
     */
    public Curso(String nombre, String siglas, int creditos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.creditos = creditos;
    }
//----------------------------------------------------------------
    
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
     * @return int numero de atributos
     */
    public String getAtributos (int numeroAtributos) {
        switch (numeroAtributos) {
            case 0:
                return nombre;
            case 1:
                return siglas;
            case 2:
                return Integer.toString(creditos);
            default:
                return null;
        }
    }
    
    /////////////////////////////////////////////////////////
    /**
     * ***** metodos sets & gets
     */
    public static int getNumeroAtributos () {
        return etiquetas.length;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String getCreditosString () {
        return this.creditos+"".trim();
    }
    /**
     * 
     * @return String informacion del objeto
     */
    public String getInformacion () {
        return this.getNombre()+"\t"+this.getSiglas()+"\t"+this.getCreditos();
    }
    
}
