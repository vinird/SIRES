/**
 * Clase que se encarga de agregar y modificar los objetos Cursos en una lista
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vini
 */
public class RegistroCursos {

    ArrayList<Curso> listaCursos;

    //-------------------------------------------
    public RegistroCursos() {
        listaCursos = new ArrayList<Curso>();
    }
//----------------------------------------------------
    
    //////////////////////////////////////////////////////
    /**
     * 
     * @param curso
     * @return String mensaje
     */
    public String agregar(Curso curso) {
        if (curso != null) {
            if (verificarCurso(curso) == false) {
                listaCursos.add(curso);
                return "Curso agregado";
            }
            return "El curso ya se encuentra agregado";
        }
        return "No ha ingresado ninguna informacion";
    }

    //////////////////////////////////////////////////////
    /**
     * 
     * @param siglas
     * @return objeto Curso
     */
    public Curso buscar(String siglas) {
        if (!siglas.equalsIgnoreCase("")) {
            for (Curso curso : listaCursos) {
                if (curso.getSiglas().equalsIgnoreCase(siglas)) {
                    return curso;
                }
            }
        }
        return null;
    }
//////////////////////////////////////////////////////////
    /**
     * 
     * @param curso
     * @return boolean
     */
    public boolean verificarCurso(Curso curso) {
        if (curso != null) {
            if (listaCursos.isEmpty() == false) {
                for (Curso curso1 : listaCursos) {
                    if (curso1.getSiglas().equalsIgnoreCase(curso.getSiglas())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //////////////////////////////////////////////////////
    /**
     * 
     * @param curso
     * @return String menssaje
     */
    public String modificar(Curso curso) {
        if (curso != null) {
            for (int index = 0; index < listaCursos.size(); index++) {
                if (listaCursos.get(index).getSiglas().equalsIgnoreCase(curso.getSiglas())) {
                    listaCursos.remove(index);
                    listaCursos.add(index, curso);
                    return "El curso fue modificado";
                }
            }
        }
        return "No hay datos del curso";
    }

    //////////////////////////////////////////////////////
    /**
     * 
     * @param curso
     * @return String mensaje
     */
    public String eliminar(Curso curso) {
        if (curso != null) {
            for (int index = 0; index < listaCursos.size(); index++) {
                if (listaCursos.get(index).getSiglas().equalsIgnoreCase(curso.getSiglas())) {
                    listaCursos.remove(index);
                    return "El curso fue eliminado";
                }
            }
        }
        return "No ha ingresado la informacion del curso ";
    }

    ////////////////////////////////////////////////////////
    /**
     * 
     * @return String [][]
     */
    public String[][] getMatrizCuros() {
        String matriz[][] = new String[listaCursos.size()][Estudiante.getNumeroAtributos()];

        for (int index = 0; index < matriz.length; index++) {
            for (int index2 = 0; index2 < matriz[index].length; index2++) {
                matriz[index][index2] = listaCursos.get(index).getAtributos(index2);

            }
        }
        return matriz;
    }
 
    ////////////////////////////////////////////////////////
    /**
     * 
     * @return String lista de cursos
     */
    public String consultarTodoCursos() {
        String lista = "Carnet\t" + "Nombre\t\t" + "edad\n";
        if (listaCursos != null) {
            for (Curso curso : listaCursos) {
                lista += curso.getInformacion() + "\n";
            }
        }
        return lista;
    }

    /////////////////////////////////////////////////////
    /**
     * 
     * @return int tamano del curso
     */
    public int getTamano() {
        if (listaCursos.isEmpty() == false) {
            return listaCursos.size();
        }
        return 0;
    }

    //////////////////////////////////////////////////
    /**
     * 
     * @param index
     * @return String nombre de curos
     */
    public String getCursoNombre(int index) {
        return listaCursos.get(index).getNombre();
    }
    
    //////////////////////////////////////////////////
    /**
     * 
     * @param index
     * @return String siglas del curso
     */
    public String getCursoSiglas (int index) {
        if (listaCursos.isEmpty() == false){
            return listaCursos.get(index).getSiglas();
        } 
        return "";
    }
    
    ///////////////////////////////////////////////////
    /**
     * 
     * @param index
     * @return int cantidad de creditos
     */
    public int getCursoCreditos (int index) {
        if (listaCursos.isEmpty() == false) {
            return listaCursos.get(index).getCreditos();
        }
        return 0;
    }
}

