/**
 * Clase que se encarga de agregar y modificar los objetos Estudiante en un
 * ArrayList
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vini
 */
public class Registro {

    ArrayList<Estudiante> listaEstudiante;

    //------------------------------------------------------
    public Registro() {
        listaEstudiante = new ArrayList<Estudiante>();
    }
//----------------------------------------------------------

    ///////////////////////////////////////////////////////////////
    /**
     *
     * @param estudiante
     * @return String mensaje
     */
    public String agregar(Estudiante estudiante) {
        if (estudiante != null) {
            if (verificarCarnet(estudiante.getCarnet()) == false) {
                listaEstudiante.add(estudiante);
                return "Estudiante agregado";
            }
        }
        return "Este carnet ya existe";
    }

    //////////////////////////////////////////////////////////////
    /**
     *
     * @param estudiante
     * @return String mensaje
     */
    public String eliminar(Estudiante estudiante) {
        for (int index = 0; index < listaEstudiante.size(); index++) {
            if (listaEstudiante.get(index).getCarnet().equalsIgnoreCase(estudiante.getCarnet())) {
                listaEstudiante.remove(index);
                return "El estudiante fue eliminado";
            }
        }
        return "No se he encontrado el estudiante";
    }

/////////////////////////////////////////////////////////
    /**
     *
     * @param carnet
     * @return boolean
     */
    public boolean verificarCarnet(String carnet) {
        if (!carnet.equalsIgnoreCase("")) {
            if (listaEstudiante.isEmpty() == false) {
                for (int index = 0; index < listaEstudiante.size(); index++) {
                    if (listaEstudiante.get(index).getCarnet().equalsIgnoreCase(carnet)) {
                        System.out.println("Si existe");
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }

////////////////////////////////////////////////////////
    /**
     *
     * @param carnet
     * @return Objeto
     */
    public Estudiante consultar(String carnet) {
        for (Estudiante estudiante : listaEstudiante) {
            if (estudiante.getCarnet().equalsIgnoreCase(carnet)) {
                return estudiante;
            }
        }
        return null;
    }

    ///////////////////////////////////////////////////////
    /**
     *
     * @param estudiante
     * @return String mensaje
     */
    public String modificar(Estudiante estudiante) {
        if (listaEstudiante.isEmpty() == false) {
            for (int index = 0; index < listaEstudiante.size(); index++) {
                if (listaEstudiante.get(index).getCarnet().equalsIgnoreCase(estudiante.getCarnet())) {
                    listaEstudiante.remove(index);
                    listaEstudiante.add(index, estudiante);
                    return "Los datos se modificaron";
                }
            }
        }
        return "La lista esta vacia";
    }

    //////////////////////////////////////////////////////
    /**
     *
     * @return String [][]
     */
    public String[][] getMatrizEstudiante() {
        String matriz[][] = new String[listaEstudiante.size()][Estudiante.getNumeroAtributos()];

        for (int index = 0; index < matriz.length; index++) {
            for (int index2 = 0; index2 < matriz[index].length; index2++) {
                matriz[index][index2] = listaEstudiante.get(index).getAtributos(index2);

            }
        }
        return matriz;
    }

    /**
     * 
     * @param datos
     * @param opcion
     * @return String [][]
     */
    public String[][] getMatrizEstudianteIndividual(String datos, int opcion) {
        datos.trim();

        String matriz[][];

        ArrayList<Estudiante> listaRetorno = new ArrayList<>();


        for (int index = 0; index < listaEstudiante.size(); index++) {

            if (opcion == 1 && listaEstudiante.get(index).getCarnet().equalsIgnoreCase(datos)) {
                listaRetorno.add(listaEstudiante.get(index));
            }
            if (opcion == 2 && listaEstudiante.get(index).getNombre().equalsIgnoreCase(datos)) {
                listaRetorno.add(listaEstudiante.get(index));
            }
            if (opcion == 3 && listaEstudiante.get(index).getEdadString().equalsIgnoreCase(datos)) {
                listaRetorno.add(listaEstudiante.get(index));

            }
        }

        matriz = new String[listaRetorno.size()][Estudiante.getNumeroAtributos()];

        for (int index = 0; index < matriz.length; index++) {
            for (int index2 = 0; index2 < matriz[index].length; index2++) {
                matriz[index][index2] = listaRetorno.get(index).getAtributos(index2);
            }
        }

        return matriz;
    }
}
