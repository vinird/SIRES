/**
 * Objeto matricula
 */
package modelo;

import java.util.ArrayList;

/**
 *curso
 * @author vini
 */
public class Matricula {
    
    private Curso listaCursos [];
    private Estudiante estudiante;
    private int creditos;
    private static String[] etiquetasCursos = {"Nombre","Siglas","Creditos"};

//-----------------------------------------------------------------------
    /**
     * 
     * @param cursos
     * @param estudiante
     * @param creditos 
     */
    public Matricula(Curso cursos [], Estudiante estudiante, int creditos) {        
        listaCursos = cursos;
        this.estudiante = estudiante;
        this.creditos = creditos;
    }
//-----------------------------------------------------------------------

    ////////////////////////////////////////////////////////////
 
    /**
     * 
     * @param fila
     * @param columna
     * @return 
     */
    public String getAtributo (int fila, int columna) {
        switch (columna) {
            case 0:
                return listaCursos[fila].getNombre();
            case 1:
                return listaCursos[fila].getSiglas();
            case 2:
                return listaCursos[fila].getCreditosString();
            default: 
                return null;
        }  
    }
    
     /**
     * 
     * *********** metodos sets & gets ************
     */
    public static int getCantidadEtiquetas (){
        return etiquetasCursos.length;
    }
    
    public static String[] getEtiquetas () {
        return etiquetasCursos;
    }
    
    public Curso [] getCursos() {
        return listaCursos;
    }

    public void setCursos(Curso  listCurso []) {
        this.listaCursos = listCurso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    /**
     * 
     * @return int cantidad de cursos
     */
    public int getCantidadCursos () {
            return listaCursos.length;
    }
    
    
}
